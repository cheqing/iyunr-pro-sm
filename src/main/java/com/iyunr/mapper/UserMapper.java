package com.iyunr.mapper;

import java.util.List;

import com.iyunr.entity.User;

public interface UserMapper {
	public List<User> getAll();

	public List<User> likeUserName(String name);

	public int addUser(User user);
	
	public int uptUserById(User user);
	
	public int delUserById(String id);
	
	public int uptUserAgeById(String id);
}
