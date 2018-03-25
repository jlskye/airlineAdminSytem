package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {


    @Select("select * from mainorder_info where order_id = #{orderId}")    //查看main订单
    mainorderInfo findMOrder(@Param("orderId") Integer id);

    @Select("select * from sgorder_info where order_id = #{orderId}")   //查看单程订单航班号
    sgorderInfo findSOrder(@Param("orderId") Integer id);

    @Select("select * from retnorder_info where order_id = #{orderId} and order_code = #{orderCode}")     //查看往返订单
    retnorderInfo findROrder(@Param("orderId") Integer id, @Param("orderCode") Integer code);

    @Select("select * from flight_info where flight_id=#{flightID}")       //查看航班信息
    flightInfo findFlight(@Param("flightID") Integer flightID);

    @Select("select * from flight_uniinfo where flight_id=#{flightID}")   //查看单一日期航班信息（日期）
    flightUniInfo findUniFlight(@Param("flightID") Integer flightID);

    @Select("select * from carrier_info where carrier_id=#{carrierID}")
    carrierInfo carrierInfo(@Param("carrierID") String carrierID);

    @Select("select * from psg_info where order_id=#{orderID}")
    psgInfo psgInfo(@Param("orderID") Integer orderID);

    @Delete("delete from mainorder_info where order_id = #{orderId}")
    void delMOrder(@Param("orderId") Integer id);
    @Delete("delete from sgorder_info where order_id = #{orderId}")
    void delSOrder(@Param("orderId") Integer id);
    @Delete("delete from retnorder_info where order_id = #{orderId}")
    void delROrder(@Param("orderId") Integer id);
    @Delete("delete from psg_info where order_id = #{orderId}")
    void delPsg(@Param("orderId") Integer id);
}
