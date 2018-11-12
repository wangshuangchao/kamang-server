package com.mugua.core.pay.mgaddress.service;

import java.util.List;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.pay.mgaddress.pojo.MgAddress;

public interface MgAddressService {

	ResultInfo<String> addAddr(MgAddress address);

	ResultInfo<List<MgAddress>> getByUid(String uid);

	ResultInfo<String> updateAddr(MgAddress address);

	ResultInfo<String> deleteAddr(Integer id);

	ResultInfo<String> updateDefault(MgAddress address);

}
