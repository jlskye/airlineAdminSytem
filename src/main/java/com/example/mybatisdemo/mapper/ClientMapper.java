package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.Client;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClientMapper {

    @Select("select * from user_info")
    List<Client> findAll();
    @Insert("insert into user_info( uname,phone, idNumber, assets) values(#{uname},#{phone},#{idNumber},#{assets})")
    void insert(Client client);
    @Delete("delete from user_info where id=#{id}")
    void deleteById(int id);
}
