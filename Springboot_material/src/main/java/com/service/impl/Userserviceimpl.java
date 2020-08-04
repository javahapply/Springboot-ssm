package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Usersdao;
import com.pojo.Users;
import com.service.Userservice;

@Service
public class Userserviceimpl implements Userservice{

	@Autowired
	private Usersdao userdao;
	
	@Override
	public Users checkusers(Users users) {
		
		
		return userdao.checkusers(users);
	}

	@Override
	public boolean insertUser(Users users) {
		
		return userdao.insertUser(users);
	}
	
}
