package com.mugua.core.pay.mggoods.mapper;

import com.mugua.core.pay.mggoods.pojo.MgGoods;
import com.mugua.core.pay.mggoods.pojo.MgGoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface MgGoodsMapper {
	@Select("select * from mg_goods where IS_RECOMMEND=1 AND IS_CERTIFICATION=1")
	@Results(value={
    		@Result(property = "isShot", column = "IS_SHOT"),@Result(property = "isRecommend", column = "IS_RECOMMEND"),
    		@Result(property = "isLimitid", column = "IS_LIMITID"),@Result(property = "isCertification", column = "IS_CERTIFICATION")})
	List<MgGoods> selectByCommend();
	
	@Select("select LIMITID from mg_goods where ID=#{id}")
	Integer getLimitById(String id);
	@Select("select IS_LIMITID from mg_goods where ID=#{id}")
	Integer getISLimit(String id);
	
	@Select("select NUM from mg_goods where ID=#{id}")
	Integer getNumById(String id);
	
	@Select("select * from mg_goods where MERCHANT=#{merchant}")
	@Results(value={
    		@Result(property = "isShot", column = "IS_SHOT"),@Result(property = "isRecommend", column = "IS_RECOMMEND"),
    		@Result(property = "isLimitid", column = "IS_LIMITID"),@Result(property = "isCertification", column = "IS_CERTIFICATION")})
	List<MgGoods> getByUid(@Param("merchant")String merchant);
	
	@Update("UPDATE mg_goods SET IS_SHOT=0 WHERE ID=#{id}")
	int deleteGoods(@Param("id")String id);
	
    int countByExample(MgGoodsExample example);

    int deleteByExample(MgGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(MgGoods record);

    int insertSelective(MgGoods record);

    List<MgGoods> selectByExample(MgGoodsExample example);

    MgGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MgGoods record, @Param("example") MgGoodsExample example);

    int updateByExample(@Param("record") MgGoods record, @Param("example") MgGoodsExample example);

    int updateByPrimaryKeySelective(MgGoods record);

    int updateByPrimaryKey(MgGoods record);

    @Update("UPDATE mg_goods SET IS_CERTIFICATION=#{isCertification} WHERE ID=#{goodsId}")
	int trunCertification(@Param("isCertification") int isCertification,@Param("goodsId")String goodsId );
    
    @Update("UPDATE mg_goods SET NUM=#{num} WHERE ID=#{goodsId}")
    int minusNum(@Param("num") int num,@Param("goodsId")String goodsId );
    
}