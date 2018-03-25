package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.Client;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ClientMapper {

    @Select("select * from user_info")
    List<Client> findAll();
    @Insert("insert into user_info( user_name,user_phone, user_id, user_money) values(#{user_name},#{user_phone},#{user_id},#{user_money})")
    void insert(Client client);
    @Delete("delete from user_info where id=#{id}")
    void deleteById(int id);
    @Update("update user_info set user_name=#{user_name},user_phone=#{user_phone},user_id=#{user_id},user_money=#{user_money} where id=#{id}")
    void updateById(Client client);
}
