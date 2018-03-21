package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.Carrier;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CarrierMapper {

    @Select("select * from carrier_info")
    List<Carrier> findAll();
    @Insert("insert into carrier_info( picpath,cname, code, landline) values(#{picpath},#{cname},#{code},#{landline})")
    void insert(Carrier carrier);
    @Delete("delete from carrier_info where id=#{id}")
    void deleteById(int id);
    @Update("update carrier_info set picpath=#{picpath},cname=#{cname},code=#{code},landline=#{landline} where id=#{id}")
    void updateById(Carrier carrier);
}
