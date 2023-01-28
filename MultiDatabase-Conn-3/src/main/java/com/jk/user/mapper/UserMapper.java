package com.jk.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jk.model.user.User;

@Mapper
public interface UserMapper {
    @Select("Select * from user_tb")
	List<User> findAll();
}
