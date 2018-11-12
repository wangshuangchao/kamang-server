package com.mugua.core.update.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mugua.core.update.pojo.UpdateInfo;

@Mapper
public interface UpdateInfoMapper {

	@Select("select * from updateInfo")
	UpdateInfo getUpdateInfo();
}
