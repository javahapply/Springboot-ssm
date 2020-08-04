package com.dao;

import org.apache.ibatis.annotations.Mapper;

import com.pojo.Users;

@Mapper
public interface Usersdao {
	public Users checkusers(Users users);
	
	public boolean insertUser(Users users);
}
