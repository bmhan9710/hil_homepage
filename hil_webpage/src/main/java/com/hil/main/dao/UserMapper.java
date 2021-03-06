package com.hil.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.hil.main.model.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT name, part FROM user_base")
	List<User> findAll();
	
	@Insert("INSERT INTO user_base(name, part) VALUES(#{name}, #{part})")
	int save(User user);

}
