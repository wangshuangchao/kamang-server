package com.mugua.core.pay.mgaddress.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.mgaddress.pojo.MgAddress;
import com.mugua.core.pay.mgaddress.service.MgAddressService;

@RestController
@RequestMapping(value="/mgshop")
public class MgAddressController {

	@Autowired
	private MgAddressService AddressService;
	
	@PostMapping(value="/addAddr")
	public ResultInfo<String> addAddr(MgAddress address){
		ResultInfo<String> result=AddressService.addAddr(address);
		return result;
	}
	
	@GetMapping(value="/getAddr")
	public ResultInfo<List<MgAddress>> getByUid(String uid){
		ResultInfo<List<MgAddress>> result=AddressService.getByUid(uid);
		return result;
	}
	@PostMapping(value="/updateAddr")
	public ResultInfo<String> updateAddr(MgAddress address){
		ResultInfo<String> result=AddressService.updateAddr(address);
		return result;
	}
	@PostMapping(value="/updateDefault")
	public ResultInfo<String> updateDefault(MgAddress address){
		ResultInfo<String> result=AddressService.updateDefault(address);
		return result;
	}
	@PostMapping(value="/deleteAddr")
	public ResultInfo<String> deleteAddr(Integer id){
		ResultInfo<String> result=AddressService.deleteAddr(id);
		return result;
	}
	
}
