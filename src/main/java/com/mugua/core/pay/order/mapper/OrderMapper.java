package com.mugua.core.pay.order.mapper;

import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.order.pojo.OrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    @Insert(" INSERT INTO `order` (ID, GOODS_NAME, GOODS_DETAIL, GOODS_NUM, GOODS_PHOTO, TOTAL_FEE, GOODS_PRICE, RECEIVER, RECEIVER_ADDRESS, "
    		+ "RECEIVER_ZIP_CODE, RECEIVER_PHONE, CREATE_TIME, PAYMENT_TYPE, USER_ID, USER_NAME, SHIPPING_CODE, SHIPPING_NAME, SELLERID, PAY_STATUS, EXT)"
    		+ "values (#{id}, #{goodsName}, #{goodsDetail}, #{goodsNum}, #{goodsPhoto}, #{totalFee}, #{goodsPrice}, #{receiver}, #{receiverAddress}, #{receiverZipCode},"
    		+ " #{receiverPhone}, #{createTime}, #{paymentType}, #{userId,jdbcType=VARCHAR}, #{userName}, #{shippingCode}, #{shippingName}, #{sellerid}, #{payStatus}, #{ext})")
    int addOrder(Order order);
    
    @Select("SELECT * FROM `order` WHERE USER_ID=#{userId} AND PAY_STATUS='1'")
    @Results(value={
    		@Result(property = "ext", column = "EXT"),@Result(property = "receiverPhone", column = "RECEIVER_PHONE"),
    		@Result(property = "createTime", column = "CREATE_TIME"),
    		@Result(property = "id", column = "ID"),@Result(property = "goodsName", column = "GOODS_NAME"),
    		@Result(property = "goodsDetail", column = "GOODS_DETAIL"),@Result(property = "goodsNum", column = "GOODS_NUM"),
    		@Result(property = "goodsPhoto", column = "GOODS_PHOTO"),@Result(property = "receiverAddress", column = "RECEIVER_ADDRESS"),
    		@Result(property = "payStatus", column = "PAY_STATUS"),@Result(property = "paymentType", column = "PAYMENT_TYPE"),
    		@Result(property = "userId", column = "USER_ID"),@Result(property = "userName", column = "USER_NAME"),
    		@Result(property = "shippingCode", column = "SHIPPING_CODE"),@Result(property = "shippingName", column = "SHIPPING_NAME"),
    		@Result(property = "totalFee", column = "TOTAL_FEE"),@Result(property = "receiverZipCode", column = "RECEIVER_ZIP_CODE")})
    List<Order> selectByUserId(String userId);
    
    @Select("SELECT * FROM `order`")
    @Results(value={
    		@Result(property = "ext", column = "EXT"),@Result(property = "receiverPhone", column = "RECEIVER_PHONE"),
    		@Result(property = "createTime", column = "CREATE_TIME"),
    		@Result(property = "id", column = "ID"),@Result(property = "goodsName", column = "GOODS_NAME"),
    		@Result(property = "goodsDetail", column = "GOODS_DETAIL"),@Result(property = "goodsNum", column = "GOODS_NUM"),
    		@Result(property = "goodsPhoto", column = "GOODS_PHOTO"),@Result(property = "receiverAddress", column = "RECEIVER_ADDRESS"),
    		@Result(property = "payStatus", column = "PAY_STATUS"),@Result(property = "paymentType", column = "PAYMENT_TYPE"),
    		@Result(property = "userId", column = "USER_ID"),@Result(property = "userName", column = "USER_NAME"),
    		@Result(property = "shippingCode", column = "SHIPPING_CODE"),@Result(property = "shippingName", column = "SHIPPING_NAME"),
    		@Result(property = "totalFee", column = "TOTAL_FEE"),@Result(property = "receiverZipCode", column = "RECEIVER_ZIP_CODE")})
    List<Order> getAll();
    
    @Select("SELECT * FROM `order` WHERE EXT=#{goodsId} AND USER_ID=#{userId} AND PAY_STATUS='1'")
    @Results(value={
    		@Result(property = "ext", column = "EXT"),@Result(property = "receiverPhone", column = "RECEIVER_PHONE"),
    		@Result(property = "createTime", column = "CREATE_TIME"),
    		@Result(property = "id", column = "ID"),@Result(property = "goodsName", column = "GOODS_NAME"),
    		@Result(property = "goodsDetail", column = "GOODS_DETAIL"),@Result(property = "goodsNum", column = "GOODS_NUM"),
    		@Result(property = "goodsPhoto", column = "GOODS_PHOTO"),@Result(property = "receiverAddress", column = "RECEIVER_ADDRESS"),
    		@Result(property = "payStatus", column = "PAY_STATUS"),@Result(property = "paymentType", column = "PAYMENT_TYPE"),
    		@Result(property = "userId", column = "USER_ID"),@Result(property = "userName", column = "USER_NAME"),
    		@Result(property = "shippingCode", column = "SHIPPING_CODE"),@Result(property = "shippingName", column = "SHIPPING_NAME"),
    		@Result(property = "totalFee", column = "TOTAL_FEE"),@Result(property = "receiverZipCode", column = "RECEIVER_ZIP_CODE")})
    List<Order> selectByGoodsId(@Param("userId")String userId,@Param("goodsId")String goodsId);
    
    @Update("UPDATE `order` SET PAY_STATUS='1' WHERE ID=#{id}")
    int upadateOrder(@Param("id")long id);
    
    @Delete("DELETE FROM `order` WHERE PAY_STATUS='0'")
    int deleteOrder();
    
    @Delete("DELETE FROM `order` WHERE ID=#{id}")
    int delOrder(@Param("id") long id);
}