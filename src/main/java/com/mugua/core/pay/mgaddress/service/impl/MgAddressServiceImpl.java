package com.mugua.core.pay.mgaddress.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.mgaddress.mapper.MgAddressMapper;
import com.mugua.core.pay.mgaddress.pojo.MgAddress;
import com.mugua.core.pay.mgaddress.service.MgAddressService;
@Service
public class MgAddressServiceImpl implements MgAddressService {

	@Autowired
	private MgAddressMapper addressMapper;

	@Override
	public ResultInfo<String> addAddr(MgAddress address) {
		
		ResultInfo<String> result=new ResultInfo<>();
		String uid=address.getUid();
		List<MgAddress> list = addressMapper.selectByUid(uid);
		if(list!=null && !list.isEmpty()){
			address.setIsDefault("0");
		}else{
			address.setIsDefault("1");
		}
		int i = addressMapper.insert(address);
		if(i==1){
			result.setCode("1000");
			result.setData("添加成功");
			result.setMsg("添加地址成功");
			return result;
		}else {
			result.setCode("1001");
			result.setData("添加失败");
			result.setMsg("添加地址失败");
			return result;
		}
	}

	@Override
	public ResultInfo<List<MgAddress>> getByUid(String uid) {
		ResultInfo<List<MgAddress>> result=new ResultInfo<>();
		List<MgAddress> list = addressMapper.selectByUid(uid);
		if(list!=null && !list.isEmpty()){
			result.setCode("1000");
			result.setMsg("获取成功");
			result.setData(list);
			return result;
			
		}
		result.setData(list);
		result.setCode("1001");
		result.setMsg("还未添加地址");
		return result;
		
	}

	@Override
	public ResultInfo<String> updateAddr(MgAddress address) {
		MgAddress ma = addressMapper.selectByPrimaryKey(address.getId());
		String isDefault = ma.getIsDefault();
		if(isDefault.equals("1")){
			address.setIsDefault("1");
		}
		ResultInfo<String> result=new ResultInfo<>();
		int i = addressMapper.updateByPrimaryKey(address);
		if(i!=1){
			result.setCode("1001");
			result.setMsg("修改失败");
			result.setData("失败");
			return result;
			
		}
		result.setData("成功");
		result.setCode("1000");
		result.setMsg("修改成功");
		return result;
	}

	@Override
	public ResultInfo<String> deleteAddr(Integer id) {
		ResultInfo<String> result=new ResultInfo<>();
		MgAddress ma = addressMapper.selectByPrimaryKey(id);
		String isDefault = ma.getIsDefault();
		String uid=ma.getUid();
		//如果删除的为默认地址
		if("1".equals(isDefault)){
			int i = addressMapper.deleteByPrimaryKey(id);
			if(i!=1){
				result.setCode("1001");
				result.setMsg("删除失败");
				result.setData("失败");
				return result;
				
			}else{
				List<MgAddress> list = addressMapper.selectByUid(uid);
				if(list!=null && !list.isEmpty()){
					MgAddress mad = list.get(0);
					mad.setIsDefault("1");
					addressMapper.updateByPrimaryKey(mad);
				}
				result.setData("成功");
				result.setCode("1000");
				result.setMsg("删除成功");
				return result;
			}
			
		}
		int i = addressMapper.deleteByPrimaryKey(id);
		if(i!=1){
			result.setCode("1001");
			result.setMsg("删除失败");
			result.setData("失败");
			return result;
			
		}
		result.setData("成功");
		result.setCode("1000");
		result.setMsg("删除成功");
		return result;
	}

	@Override
	public ResultInfo<String> updateDefault(MgAddress address) {
		ResultInfo<String> result=new ResultInfo<>();
		Integer id=address.getId();
		String uid=address.getUid();
		addressMapper.updateNotDefault(uid);
		int i=addressMapper.updateDefault(id);
		if(i!=1){
			result.setCode("1001");
			result.setMsg("修改失败");
			result.setData("失败");
			return result;
			
		}
		result.setData("成功");
		result.setCode("1000");
		result.setMsg("修改成功");
		return result;
	}
}
