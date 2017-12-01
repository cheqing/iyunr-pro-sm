package com.iyunr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iyunr.entity.User;
import com.iyunr.mapper.UserMapper;
import com.iyunr.service.UserSer;

@Service
public class UserSerImpl implements UserSer {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserByName(String name) {
		List<User> users = userMapper.likeUserName(name);
		return null;
	}

	@Transactional
	@Override
	public int addUser(User user) {
		int addNo = userMapper.addUser(user);
//		int i = 1/0;
		return addNo;
	}

	@Transactional
	@Override
	public int uptUserAgeById(String id) {
		int uptNo = userMapper.uptUserAgeById(id);
		int i = 1/0;
		return uptNo;
	}

	@Transactional
	@Override
	public int uptUserById(User user) {
		int uptNo = userMapper.uptUserById(user);
		int i = 1/0;
		return uptNo;
	}

}
