package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	/***
	 * sql操作后台数据库
	 * @param acount
	 * @return
	 */
	@Select("select * from t_admin where acount=#{acount}")
	User findByAcount(@Param("acount") String acount);

	@Select("select * from t_admin")
	List<User> findAll();

	@Insert("insert into t_admin(acount, pwd) values(#{acount},#{pwd})")
	void insert(User user);



}
