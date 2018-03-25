package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.adminInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SystemMapper {

    @Select("select * from admin_info")
    List<adminInfo> findAllAdmin();

    @Select("select * from admin_info where admin_id = #{adminId}")
    adminInfo findAdmin(@Param("adminId") Integer adminId);

    @Update("update admin_info set admin_acount=#{admin_acount},admin_pwd=#{admin_pwd},admin_perm=#{admin_perm} where admin_id=#{admin_id}")
    void updateById(adminInfo adminInfo);

    @Delete("delete from admin_info where admin_id=#{admin_id}")
    void deleteById(int admin_id);
}
