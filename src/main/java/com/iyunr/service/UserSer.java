package com.iyunr.service;

import com.iyunr.entity.User;

public interface UserSer {
	public User queryUserByName(String name);
	
	public int addUser(User user);
	
	public int uptUserAgeById(String id);
	
	public int uptUserById(User user);
}
