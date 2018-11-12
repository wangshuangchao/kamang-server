package com.mugua.core.feedback.service;

import com.mugua.common.pojo.ResultInfo;
import com.mugua.core.feedback.pojo.Feedback;

public interface FeedfaceService {

	ResultInfo<String> addFeedback(Feedback feedback);

}
