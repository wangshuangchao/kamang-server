package com.mugua.core.update.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.update.pojo.UpdateInfo;

public interface UpdateService {

	ResultInfo<UpdateInfo> getUpdateInfo();

}
