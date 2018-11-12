package com.mugua.core.userInfo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.apply.mapper.ApplyMapper;
import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.pojo.UserInfoDto;
import com.mugua.core.userInfo.pojo.UserInfoExample;
import com.mugua.core.userInfo.pojo.UserInfoExample.Criteria;
import com.mugua.core.userInfo.repository.UserInfoRepository;
import com.mugua.core.userInfo.pojo.UserInfoVo;
import com.mugua.core.userInfo.service.UserService;

@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

	@Autowired // redis
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	UserInfoRepository userInfoRepository;
	@Autowired
	ElasticsearchTemplate elasticsearchTemplate;
	@SuppressWarnings("rawtypes")
	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private ApplyMapper applyMapper;

	@Override
	public ResultInfo<String> regist(UserInfo userInfo) {
		SimpleDateFormat fdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		userInfo.setId(uuid);
		String password = DigestUtils.md5Hex(userInfo.getUserPassword());
		userInfo.setUserPassword(password);
		// 为用户信息设置默认值
		userInfo.setIntroduceCompany("");
		userInfo.setCompany("");
		userInfo.setUserName(userInfo.getUserPhone());
		userInfo.setDepartment("");
		userInfo.setPhotoUrl("");
		userInfo.setAttendingPersonnel("");
		userInfo.setUserAge(0);
		userInfo.setUserGender(new Byte("0"));
		userInfo.setDepartment("");
		userInfo.setQq("");
		userInfo.setWechat("");
		userInfo.setProductUrlOne("");
		userInfo.setProductUrlTwo("");
		userInfo.setMicroblog("");
		userInfo.setCompanyVidio("");
		userInfo.setOrganizationCode("");
		userInfo.setExt("");
		userInfo.setLegalPersonId("");
		userInfo.setOrganizationCode("");
		userInfo.setCreateTime(new Date());
		userInfo.setIsCentification(new Byte("0"));
		userInfo.setRegisteredAssets("");
		userInfo.setCompanyAddr("");
		userInfo.setCompanyType("");
		userInfo.setTimeLimit(new Date());
		userInfo.setScopeOfBusiness("");
		userInfo.setBookings("");
		userInfo.setCreateUserTime(new Date());
		userInfo.setExts("0");
		userInfo.setLegalPersonName("");
		userInfo.setLegalPersonPhone("");
		userInfo.setLegalPersonPhotoUrl("");
		userInfo.setAttendingPersonnel("");
		int i = userInfoMapper.insert(userInfo);
		// userInfoRepository.save(userInfo);
		ResultInfo<String> result = new ResultInfo<>();
		if (i == 1) {
			result.setCode("1000");
			result.setMsg("注册成功");
			return result;
		} else {
			result.setCode("1002");
			result.setMsg("注册失败");
			return result;
		}
	}

	@Override
	public void updateStatus(String id, Byte isCentification) {
		userInfoMapper.updateUserById(id, isCentification);
	}

	@Override
	public void deleteUserById(String id) {
		userInfoMapper.deleteUser(id);
		userInfoRepository.delete(id);
	}

	@Override
	public UserInfo getUserById(String id) {
		return userInfoMapper.selectById(id);
	}

	@Override
	public List<UserInfo> getUserList(Pageable pag) {
		// ResultInfo<List> result =new ResultInfo<>();
		// 获取用户列表,分页获取数据
		// PageHelper.startPage(pag.getPageNumber(),pag.getPageSize());
		List<UserInfo> list = userInfoMapper.selectAll();
		return list;
	}

	@Override
	public List<UserInfo> searchUser(String keyWord, Pageable pageable) {
		Pageable pageables = new PageRequest(0, 10);
		QueryStringQueryBuilder queryString = new QueryStringQueryBuilder(keyWord);
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryString).withPageable(pageables).build();
		List<UserInfo> list = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);
		System.out.println("------------");
		for (UserInfo userInfo : list) {
			System.out.println(userInfo);
			System.out.println("-----分割线---");
		}
		return list;
	}

	@Override
	public void deleteUserById(String[] ids) {
		for (String id : ids) {
			userInfoMapper.deleteUser(id);
		}
	}

	@Override // 用户登录
	public ResultInfo<UserInfoVo> login(String userPhone, String userPassword) {
		// md5将密码进行加密
		String password = DigestUtils.md5Hex(userPassword);
		UserInfoExample example = new UserInfoExample();

		Criteria criteria = example.or().andUserPhoneEqualTo(userPhone).andUserPasswordEqualTo(password);
		List<UserInfo> list = userInfoMapper.selectByExample(example);
		// 生成token
		String token = UUID.randomUUID().toString().replaceAll("-", "");
		// 如果list为空则说明用户名或密码错误
		if (list.isEmpty()) {
			ResultInfo<UserInfoVo> result = new ResultInfo<UserInfoVo>();
			result.setMsg("用户名或密码错误");
			result.setCode("1002");
			return result;
		} else {
			ResultInfo<UserInfoVo> result = new ResultInfo<UserInfoVo>();
			UserInfoVo userInfoVo = new UserInfoVo();
			UserInfo userInfo = list.get(0);
			BeanUtils.copyProperties(userInfo, userInfoVo);
			// 将生成的token存入redis,并缓存redis
			stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "token", token);
			// 缓存登录信息
			redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userInfoVo);
			// 活动
			String join = "0";
			Apply apply = applyMapper.selectByUid(userInfo.getId());
			if (apply != null) {
				join = "1";
			}
			userInfoVo.setJoin(join);
			userInfoVo.setToken(token);
			result.setCode("1000");
			result.setMsg("登陆成功");
			result.setData(userInfoVo);
			return result;
		}
	}

	@Override // 修改密码
	public ResultInfo<String> turnPassword(String userPhone, String newPwd) {
		// md5将密码进行加密
		String password = DigestUtils.md5Hex(newPwd);
		int i = userInfoMapper.updatePwdByPhone(userPhone, password);
		if (i == 1) {
			ResultInfo<String> result = new ResultInfo<>();
			result.setCode("1000");
			result.setMsg("修改成功");
			return result;
		} else {
			ResultInfo<String> result = new ResultInfo<>();
			result.setCode("1001");
			result.setMsg("修改失败");
			return result;
		}
	}

	@Override
	public ResultInfo<UserInfo> turnLogo(String id, String photoUrl) {
		ResultInfo<UserInfo> result = new ResultInfo<>();
		UserInfo userInfo = userInfoMapper.selectById(id);
		userInfo.setPhotoUrl(photoUrl);
		int i = userInfoMapper.updateByPrimaryKey(userInfo);
		if (i == 1) {
			result.setCode("1000");
			result.setMsg("修改成功");
			result.setData(userInfo);
			return result;
		} else {
			result.setCode("1001");
			result.setMsg("修改失败");
			result.setData(userInfo);
			return result;

		}
	}

	@Override
	public ResultInfo<UserInfo> turnName(String id, String userName) {
		ResultInfo<UserInfo> result = new ResultInfo<>();
		UserInfo userInfo = userInfoMapper.selectById(id);
		userInfo.setUserName(userName);
		int i = userInfoMapper.updateByPrimaryKey(userInfo);
		if (i == 1) {
			result.setCode("1000");
			result.setMsg("修改成功");
			result.setData(userInfo);
			return result;
		} else {
			result.setCode("1001");
			result.setMsg("修改失败");
			result.setData(userInfo);
			return result;

		}
	}

	@Override
	public ResultInfo<UserInfo> turnType(String id, String companyType) {
		ResultInfo<UserInfo> result = new ResultInfo<>();
		UserInfo userInfo = userInfoMapper.selectById(id);
		userInfo.setCompanyType(companyType);
		int i = userInfoMapper.updateByPrimaryKey(userInfo);
		if (i == 1) {
			result.setCode("1000");
			result.setMsg("修改成功");
			result.setData(userInfo);
			return result;
		} else {
			result.setCode("1001");
			result.setMsg("修改失败");
			result.setData(userInfo);
			return result;

		}
	}

	@Override
	public ResultInfo<UserInfo> identification(UserInfo userInfo) {
		ResultInfo<UserInfo> result = new ResultInfo<>();
		UserInfo user = userInfoMapper.selectById(userInfo.getId());
		if (userInfo.getCompany() != null) {
			user.setCompany(userInfo.getCompany());
		}
		if (userInfo.getLegalPersonName() != null) {
			user.setLegalPersonName(userInfo.getLegalPersonName());
		}
		if (userInfo.getLegalPersonId() != null) {
			user.setLegalPersonId(userInfo.getLegalPersonId());
		}
		if (userInfo.getBusinessLicensePhotoUrl() != null) {
			user.setBusinessLicensePhotoUrl(userInfo.getBusinessLicensePhotoUrl());
		}
		if (userInfo.getLegalPersonPhotoUrl() != null) {
			user.setLegalPersonPhotoUrl(userInfo.getLegalPersonPhotoUrl());
		}
		if (userInfo.getExt() != null) {
			user.setExt(userInfo.getExt());
		}
		if (userInfo.getIsCentification() != null) {
			user.setIsCentification(userInfo.getIsCentification());
		}
		int i = userInfoMapper.updateByPrimaryKeySelective(user);
		if (i == 1) {
			result.setCode("1000");
			result.setData(user);
			result.setMsg("提交成功");
			return result;
		}
		result.setCode("1001");
		result.setData(userInfo);
		result.setMsg("提交失败");
		return result;
	}

	@Override
	public ResultInfo<UserInfoVo> turnIdentification(String id, Byte isCentification) {
		ResultInfo<UserInfoVo> result = new ResultInfo<>();
		UserInfoVo vo = new UserInfoVo();
		int i = userInfoMapper.updateUserById(id, isCentification);
		if (i == 1) {
			UserInfo userInfo = userInfoMapper.selectById(id);
			BeanUtils.copyProperties(userInfo, vo);
			result.setCode("1000");
			result.setData(vo);
			result.setMsg("修改成功");
			return result;
		}
		result.setCode("1001");
		result.setMsg("修改失败");
		return result;
	}

	@Override
	public ResultInfo<UserInfoVo> fastLogin(String type, UserInfo userInfo) {
		ResultInfo<UserInfoVo> result = new ResultInfo<>();
		UserInfoVo userVo = new UserInfoVo();
		// 生成token
		String token = UUID.randomUUID().toString().replaceAll("-", "");
		// 如果是QQ登录
		if ("0".equals(type)) {
			// 先判断是否已经注册
			String qq = userInfo.getQq();
			UserInfoExample example = new UserInfoExample();
			Criteria criteria = example.or().andQqEqualTo(qq);
			List<UserInfo> list = userInfoMapper.selectByExample(example);
			// 如果未注册,则注册
			if (list.isEmpty()) {
				// 如果QQ号不存在,则判断手机号码是否已经注册
				// md5将密码进行加密
				String password = DigestUtils.md5Hex(userInfo.getUserPassword());
				criteria = example.or().andUserPhoneEqualTo(userInfo.getUserPhone()).andUserPasswordEqualTo(password);
				List<UserInfo> list1 = userInfoMapper.selectByExample(example);
				// 如果手机号码未注册
				if (list1.isEmpty()) {
					String uuid = UUID.randomUUID().toString().replaceAll("-", "");
					userInfo.setId(uuid);
					userInfo.setUserPassword(password);
					// 为用户信息设置默认值
					userInfo.setIntroduceCompany("");
					userInfo.setCompany("");
					userInfo.setUserName(userInfo.getUserPhone());
					userInfo.setDepartment("");
					userInfo.setPhotoUrl("");
					userInfo.setAttendingPersonnel("");
					userInfo.setUserAge(0);
					userInfo.setUserGender(new Byte("0"));
					userInfo.setDepartment("");
					userInfo.setWechat("");
					userInfo.setProductUrlOne("");
					userInfo.setProductUrlTwo("");
					userInfo.setMicroblog("");
					userInfo.setCompanyVidio("");
					userInfo.setOrganizationCode("");
					userInfo.setExt("");
					userInfo.setLegalPersonId("");
					userInfo.setOrganizationCode("");
					userInfo.setCreateTime(new Date());
					userInfo.setIsCentification(new Byte("0"));
					userInfo.setRegisteredAssets("");
					userInfo.setCompanyAddr("");
					userInfo.setCompanyType("");
					userInfo.setTimeLimit(new Date());
					userInfo.setScopeOfBusiness("");
					userInfo.setBookings("");
					userInfo.setCreateUserTime(new Date());
					userInfo.setExts("0");
					userInfo.setLegalPersonName("");
					userInfo.setLegalPersonPhone("");
					userInfo.setLegalPersonPhotoUrl("");
					userInfo.setAttendingPersonnel("");
					int i = userInfoMapper.insert(userInfo);
					BeanUtils.copyProperties(userInfo, userVo);
					if (i == 1) {

						// 将生成的token存入redis,并缓存redis
						stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "qq", token);
						// 缓存登录信息
						userVo.setToken(token);
						redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
						// 活动
						String join = "0";
						Apply apply = applyMapper.selectByUid(userInfo.getId());
						if (apply != null) {
							join = "1";
						}
						userVo.setJoin(join);
						result.setCode("1000");
						result.setMsg("注册成功");
						result.setData(userVo);
						return result;
					} else {
						result.setCode("1002");
						result.setMsg("注册失败");
						return result;
					}
				} else {
					// 手机号码已经注册,未绑定QQ
					UserInfo userInfo2 = list1.get(0);
					// 绑定QQ好并更新数据看
					userInfo2.setQq(qq);
					userInfoMapper.updateByPrimaryKeySelective(userInfo2);
					// UserInfo user = list.get(0);
					BeanUtils.copyProperties(userInfo2, userVo);
					// 将生成的token存入redis,并缓存redis
					stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "qq", token);
					// 缓存登录信息
					userVo.setToken(token);
					redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
					// 活动
					String join = "0";
					Apply apply = applyMapper.selectByUid(userInfo.getId());
					if (apply != null) {
						join = "1";
					}
					userVo.setJoin(join);
					result.setCode("1000");
					result.setMsg("登录成功");
					result.setData(userVo);
					return result;
				}
				// 如果已经注册并且绑定手机
			} else {
				UserInfo user = list.get(0);
				BeanUtils.copyProperties(user, userVo);
				// 将生成的token存入redis,并缓存redis
				stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "qq", token);
				// 缓存登录信息
				userVo.setToken(token);
				redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
				// 活动
				String join = "0";
				Apply apply = applyMapper.selectByUid(userInfo.getId());
				if (apply != null) {
					join = "1";
				}
				userVo.setJoin(join);
				result.setCode("1000");
				result.setMsg("登录成功");
				result.setData(userVo);
				return result;
			}
			// 如果为1则为微信登录
		} else if ("1".equals(type)) {
			// 先判断是否已经注册
			String wechat = userInfo.getWechat();
			UserInfoExample example = new UserInfoExample();
			Criteria criteria = example.or().andWechatEqualTo(wechat);
			List<UserInfo> list = userInfoMapper.selectByExample(example);
			// 如果未注册,则注册
			if (list.isEmpty()) {
				// 如果微信号不存在,则判断手机号码是否已经注册
				String password = DigestUtils.md5Hex(userInfo.getUserPassword());
				criteria = example.or().andUserPhoneEqualTo(userInfo.getUserPhone()).andUserPasswordEqualTo(password);
				List<UserInfo> list1 = userInfoMapper.selectByExample(example);
				// 如果手机号码未注册
				if (list1.isEmpty()) {
					String uuid = UUID.randomUUID().toString().replaceAll("-", "");
					userInfo.setId(uuid);
					userInfo.setUserPassword(password);
					// 为用户信息设置默认值
					userInfo.setWechat(wechat);
					userInfo.setQq("");
					userInfo.setIntroduceCompany("");
					userInfo.setCompany("");
					userInfo.setUserName(userInfo.getUserPhone());
					userInfo.setDepartment("");
					userInfo.setPhotoUrl("");
					userInfo.setAttendingPersonnel("");
					userInfo.setUserAge(0);
					userInfo.setUserGender(new Byte("0"));
					userInfo.setDepartment("");
					userInfo.setProductUrlOne("");
					userInfo.setProductUrlTwo("");
					userInfo.setMicroblog("");
					userInfo.setCompanyVidio("");
					userInfo.setOrganizationCode("");
					userInfo.setExt("");
					userInfo.setLegalPersonId("");
					userInfo.setOrganizationCode("");
					userInfo.setCreateTime(new Date());
					userInfo.setIsCentification(new Byte("0"));
					userInfo.setRegisteredAssets("");
					userInfo.setCompanyAddr("");
					userInfo.setCompanyType("");
					userInfo.setTimeLimit(new Date());
					userInfo.setScopeOfBusiness("");
					userInfo.setBookings("");
					userInfo.setCreateUserTime(new Date());
					userInfo.setExts("0");
					userInfo.setLegalPersonName("");
					userInfo.setLegalPersonPhone("");
					userInfo.setLegalPersonPhotoUrl("");
					userInfo.setAttendingPersonnel("");
					int i = userInfoMapper.insert(userInfo);
					BeanUtils.copyProperties(userInfo, userVo);
					if (i == 1) {
						// 将生成的token存入redis,并缓存redis
						stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "wechat", token);
						// 缓存登录信息
						userVo.setToken(token);
						redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
						// 活动
						String join = "0";
						Apply apply = applyMapper.selectByUid(userInfo.getId());
						if (apply != null) {
							join = "1";
						}
						userVo.setJoin(join);
						result.setCode("1000");
						result.setMsg("注册成功");
						result.setData(userVo);
						return result;
					} else {
						result.setCode("1002");
						result.setMsg("注册失败");
						return result;
					}
				} else {
					// 手机号码已经注册,未绑定QQ
					UserInfo userInfo2 = list1.get(0);
					// 绑定微信并更新数据看
					userInfo2.setWechat(wechat);
					userInfoMapper.updateByPrimaryKeySelective(userInfo2);
					// UserInfo user = list.get(0);
					BeanUtils.copyProperties(userInfo2, userVo);
					// 将生成的token存入redis,并缓存redis
					stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "wechat", token);
					// 缓存登录信息
					userVo.setToken(token);
					redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
					// 活动
					String join = "0";
					Apply apply = applyMapper.selectByUid(userInfo.getId());
					if (apply != null) {
						join = "1";
					}
					userVo.setJoin(join);
					result.setCode("1000");
					result.setMsg("登录成功");
					result.setData(userVo);
					return result;
				}
				// 如果已经注册并且绑定手机
			} else {
				UserInfo user = list.get(0);
				BeanUtils.copyProperties(user, userVo);
				// 将生成的token存入redis,并缓存redis
				stringRedisTemplate.opsForValue().set(userInfo.getUserPhone() + "wechat", token);
				// 缓存登录信息
				userVo.setToken(token);
				redisTemplate.opsForValue().set(userInfo.getUserPhone() + "info", userVo);
				// 活动
				String join = "0";
				Apply apply = applyMapper.selectByUid(userInfo.getId());
				if (apply != null) {
					join = "1";
				}
				userVo.setJoin(join);
				result.setCode("1000");
				result.setMsg("登录成功");
				result.setData(userVo);
				return result;
			}
		} else
			return null;

	}

	@Override
	public ResultInfo<UserInfoVo> judge(String type, String num) {
		ResultInfo<UserInfoVo> result = new ResultInfo<>();
		UserInfoVo userVo = new UserInfoVo();
		// 生成token
		String token = UUID.randomUUID().toString().replaceAll("-", "");
		// 如果为QQ登录
		if ("0".equals(type)) {
			UserInfoExample example = new UserInfoExample();
			Criteria criteria = example.or().andQqEqualTo(num);
			List<UserInfo> list = userInfoMapper.selectByExample(example);
			// 如果未注册,则注册
			if (null == list || list.isEmpty()) {
				result.setCode("1001");
				result.setMsg("未注册");
				return result;
			} else {
				UserInfo userInfo = list.get(0);
				BeanUtils.copyProperties(userInfo, userVo);
				// 将生成的token存入redis,并缓存redis
				stringRedisTemplate.opsForValue().set(num + "qq", token);
				// 缓存登录信息
				userVo.setToken(token);
				redisTemplate.opsForValue().set(num + "info", userVo);
				// 活动
				String join = "0";
				Apply apply = applyMapper.selectByUid(userInfo.getId());
				if (apply != null) {
					join = "1";
				}
				userVo.setJoin(join);
				result.setCode("1000");
				result.setMsg("登录成功");
				result.setData(userVo);
				return result;
			}
		} else if ("1".equals(type)) {
			UserInfoExample example = new UserInfoExample();
			Criteria criteria = example.or().andWechatEqualTo(num);
			List<UserInfo> list = userInfoMapper.selectByExample(example);
			// 如果为空,则没绑定过
			if (null == list || list.isEmpty()) {
				result.setCode("1001");
				result.setMsg("未注册");
				return result;
			} else {
				UserInfo userInfo = list.get(0);
				BeanUtils.copyProperties(userInfo, userVo);
				// 将生成的token存入redis,并缓存redis
				stringRedisTemplate.opsForValue().set(num + "wechar", token);
				// 缓存登录信息
				userVo.setToken(token);
				redisTemplate.opsForValue().set(num + "info", userVo);
				// 活动
				String join = "0";
				Apply apply = applyMapper.selectByUid(userInfo.getId());
				if (apply != null) {
					join = "1";
				}
				userVo.setJoin(join);
				result.setCode("1000");
				result.setMsg("登录成功");
				result.setData(userVo);
				return result;
			}

		} else
			return null;
	}

	@Override
	public ResultInfo<UserInfoVo> soLogin(String type, String id) {
		ResultInfo<UserInfoVo> result = new ResultInfo<>();
		UserInfoVo userVo = new UserInfoVo();
		// 如果是QQ快速登录
		if ("0".equals(type)) {

			return result;
		} else if ("1".equals(type)) {

			return result;
		} else
			return null;
	}

	@Override
	public UserInfoDto getUserByUid(String uid) {
		UserInfo userInfo = userInfoMapper.selectById(uid);
		UserInfoDto userInfoDto = new UserInfoDto();
		if (userInfo != null) {
			BeanUtils.copyProperties(userInfo, userInfoDto);
		}
		// 活动
		String join = "0";
		Apply apply = applyMapper.selectByUid(uid);
		if (apply != null) {
			join = "1";
		}
		userInfoDto.setJoin(join);
		return userInfoDto;
	}

}