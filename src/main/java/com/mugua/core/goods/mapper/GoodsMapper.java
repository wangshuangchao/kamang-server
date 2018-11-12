package com.mugua.core.goods.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mugua.core.goods.pojo.Goods;

@Mapper
public interface GoodsMapper {

	@Select("select * from goods where id=#{id}")
	public Goods selectById(@Param("id") String id);

	@Insert("INSERT INTO goods(id,name, detail, photo1, photo2,photo3, photo4,photo5,photo6, photo7,price, ext, exts) "
			+ "VALUES(#{id},#{name},#{detail},#{photo1},#{photo2},#{photo3},#{photo4},#{photo5},#{photo6},#{photo7},#{price},#{ext},#{ext})")
	public int saveGoods(Goods goods);
}
