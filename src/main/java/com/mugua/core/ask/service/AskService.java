package com.mugua.core.ask.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.ask.pojo.Ask;

public interface AskService {

	ResultInfo<String> addAsk(Ask ask);

	ResultInfo<Ask> getAsk(String userId);

}
