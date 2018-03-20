package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.Air;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AirMapper {

    @Select("select * from air_info")
    List<Air> findAll();
    @Insert("insert into air_info( classifications,cabin, assembly, description) values(#{classifications},#{cabin},#{assembly},#{description})")
    void insert(Air air);
    @Delete("delete from air_info where id=#{id}")
    void deleteById(int id);
    @Update("update air_info set classifications=#{classifications},cabin=#{cabin},assembly=#{assembly},description=#{description} where id=#{id}")
    void updateById(Air air);
}
