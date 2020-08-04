package com.service;

import com.pojo.Users;

public interface Userservice {
	public Users checkusers(Users users);
	
	public boolean insertUser(Users users);
}
