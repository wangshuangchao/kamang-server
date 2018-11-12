package com.mugua.core.product.mapper;

import com.mugua.core.product.pojo.ProductInfo;
import com.mugua.core.product.pojo.ProductInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
    
    @Update ("update product_info set STATE =#{state} where PRODUCT_ID=#{id} ")
    int updateState(@Param("id")String id,@Param("state")String state);
}