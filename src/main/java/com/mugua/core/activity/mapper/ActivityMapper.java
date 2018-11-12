package com.mugua.core.activity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mugua.core.activity.pojo.Activity;

@Mapper
public interface ActivityMapper {

	@Select("select * from activity")
	public List<Activity> getAll();
}
