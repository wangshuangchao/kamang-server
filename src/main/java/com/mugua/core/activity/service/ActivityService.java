package com.mugua.core.activity.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.activity.pojo.Share;

public interface ActivityService {

	ResultInfo<Share> share(String uid);

}
