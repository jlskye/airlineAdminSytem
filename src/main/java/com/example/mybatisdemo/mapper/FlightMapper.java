package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.flightInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface FlightMapper {

    @Select("select * from flight_info")
    List<flightInfo> findALLFlight();

    @Select("select * from flight_info where flight_id=#{flightID}")       //查看航班信息
    flightInfo findFlight(@Param("flightID") Integer flightID);

    @Insert("insert into flight_info" +
            "( flight_no, dep_time, arr_time, dep_airport,dep_city,arr_airport, arr_city,carrier_id, air_name  ) " +
            "values(#{flight_no},#{dep_time},#{arr_time},#{dep_airport},#{dep_city},#{arr_airport},#{arr_city},#{carrier_id},#{air_name})")
    void insert(flightInfo flight);

    @Delete("delete from flight_info where flight_id=#{flight_id}")
    void deleteById(int flight_id);

    @Update("update flight_info set dep_time=#{depTime},arr_time=#{arrTime},dep_city=#{dep_city},arr_city=#{arr_city}," +
            "dep_airport=#{depAirport},arr_airport=#{arrAirport},carrier_id=#{carrierID}" +
            "where flight_no=#{flightNo}")
    void updateById(flightInfo flightInfo);
}
