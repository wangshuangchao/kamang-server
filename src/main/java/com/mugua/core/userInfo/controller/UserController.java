package com.mugua.core.userInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.pojo.UserInfoDto;
import com.mugua.core.userInfo.pojo.UserInfoVo;
import com.mugua.core.userInfo.service.UserService;

import groovy.util.logging.Slf4j;


@RestController
@RequestMapping("/app/user")
@Slf4j
@SuppressWarnings("rawtypes")
public class UserController {
	// 创建日志文件
	@Autowired
	private UserService userServiceImpl;
	@Autowired // redis
	private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisTemplate redisTemplate;

	

	@PostMapping(value = "/regist")
	public ResultInfo<String> regist(UserInfo userInfo, String code) {
		// 获取缓存中的验证码
		String redisCode = stringRedisTemplate.opsForValue().get(userInfo.getUserPhone());
		// 如果验证码匹配
		if (code.equals(redisCode)) {
			ResultInfo<String> result = userServiceImpl.regist(userInfo);
			return result;
		} else {
			ResultInfo<String> result = new ResultInfo<String>();
			result.setCode("1001");
			result.setMsg("验证码已失效");
			result.setData("注册失败");
			return result;
		}
	}

	/**
	 * 
	 * @param userPhone
	 * @param userPassword
	 * @param token
	 * @return
	 */
	@GetMapping(value = "/login")
	public ResultInfo<UserInfoVo> login(String userPhone, String userPassword, String token) {
		String redisToken = stringRedisTemplate.opsForValue().get(userPhone + "token");
		ResultInfo<UserInfoVo> result = new ResultInfo<>();
		if (token != null) {
			// 如果登录 过判断是否缓存信息
			if (token.equals(redisToken)) {
				UserInfoVo userInfoVo = (UserInfoVo) redisTemplate.opsForValue().get(userPhone + "info");
				result.setCode("1000");
				userInfoVo.setToken(token);
				result.setData(userInfoVo);
				result.setMsg("登录成功");
				return result;
			} else {
				ResultInfo<UserInfoVo> results = userServiceImpl.login(userPhone, userPassword);
				return results;
			}
		} else {
			ResultInfo<UserInfoVo> results = userServiceImpl.login(userPhone, userPassword);
			return results;
		}
	}
	
	@PostMapping(value = "/fastLogin")
	public ResultInfo<UserInfoVo> fastLogin(String type,UserInfo userInfo,String code){
		ResultInfo<UserInfoVo> result=new ResultInfo<>();
		// 获取缓存中的验证码
		String redisCode = stringRedisTemplate.opsForValue().get(userInfo.getUserPhone());
		// 如果验证码匹配
		if (code.equals(redisCode)) {
			
		}else{
			result.setCode("1001");
			result.setMsg("验证码失效");
			return result;
		}
		result=userServiceImpl.fastLogin(type,userInfo);
		return result;
	}
	
	//判断是否快速登录过
	@GetMapping(value = "/judge")
	public ResultInfo<UserInfoVo> judge(String type,String num){
		ResultInfo<UserInfoVo> result=userServiceImpl.judge(type,num);
		return result;
	}
	
	//QQ或者微信快速登录
	@GetMapping(value = "/soLogin")
	public ResultInfo<UserInfoVo> soLogin(String type,String token){
		ResultInfo<UserInfoVo> result=userServiceImpl.soLogin(type,token);
		return result;
	}

	
	
	@GetMapping("/getUserInfo")
	public ResultInfo<UserInfo> getUserInfo(String id){
		UserInfo userInfo = userServiceImpl.getUserById(id);
		ResultInfo<UserInfo> result=new ResultInfo<>();
		if(userInfo!=null){
			result.setCode("1000");
			result.setMsg("成功");
			result.setData(userInfo);
			return result;
		}else{
			result.setCode("1001");
			result.setMsg("失败");
			return result;
		}
	}
	@GetMapping("/getUserInfos")
	public ResultInfo<UserInfoDto> getUserInfos(String id){
		UserInfoDto userInfoDto = userServiceImpl.getUserByUid(id);
		ResultInfo<UserInfoDto> result=new ResultInfo<>();
		if(userInfoDto!=null){
			result.setCode("1000");
			result.setMsg("成功");
			result.setData(userInfoDto);
			return result;
		}else{
			result.setCode("1001");
			result.setMsg("失败");
			return result;
		}
	}
	
	@PostMapping(value="/forgetPassword")
	public ResultInfo<String>  turnPassword(String userPhone,String newPwd ,String code){
		// 获取缓存中的验证码
		String redisCode = stringRedisTemplate.opsForValue().get(userPhone);
		// 如果验证码匹配
		if (code.equals(redisCode)) {
			ResultInfo<String> result=userServiceImpl.turnPassword(userPhone,newPwd);
			return result;
		} else {
			ResultInfo<String> result = new ResultInfo<String>();
			result.setCode("1001");
			result.setMsg("验证码已失效");
			return result;
		}
		
	}
	
	//更改Logo
	@PostMapping(value="/turnLogo")
	public ResultInfo<UserInfo> turnLogo(String id,String photoUrl){
		ResultInfo<UserInfo> result =userServiceImpl.turnLogo(id,photoUrl);
		return result;
	}
	//更改企业简称
	@PostMapping(value="/turnName")
	public ResultInfo<UserInfo> turnName(String id,String userName){
		ResultInfo<UserInfo> result =userServiceImpl.turnName(id,userName);
		return result;
	}
	//更改企业简称
	@PostMapping(value="/turnType")
	public ResultInfo<UserInfo> turnType(String id,String companyType){
		ResultInfo<UserInfo> result =userServiceImpl.turnType(id,companyType);
		return result;
	}
	
	//企业认证
	@PostMapping(value="/identification")
	public ResultInfo<UserInfo> identification(UserInfo userInfo){
		ResultInfo<UserInfo> result =userServiceImpl.identification(userInfo);
		return result;
	}
	
	//更改企业认证状态
	@PostMapping(value="/turnIdentification")
	public ResultInfo<UserInfoVo> turnIdentification(String id ,Byte isCentification){
		ResultInfo<UserInfoVo> result=userServiceImpl.turnIdentification(id,isCentification);
		return result;
	}
	
	

	
}
