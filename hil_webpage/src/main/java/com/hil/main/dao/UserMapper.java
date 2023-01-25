package com.hil.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.hil.main.model.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT name, part FROM user_base")
	List<User> findAll();
	
	@Insert("INSERT INTO user_base(name, part) VALUES(#{name}, #{part})")
	int save(User user);

}




// CREATE Query - MYSQL //
/*
create table user_base (
usr_no int not null auto_increment,
name char(100) not null,
part char(100) null,
primary key(usr_no)
);
*/

//CREATE Query - POSTGRESQL //
/*
create table user_base (
usr_no serial primary key,
name char(100) not null,
part char(100) null
);
*/

