package com.iyunr.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iyunr.entity.User;
import com.iyunr.exceptionHandler.ServiceException;
import com.iyunr.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> likeUserName(String name){
		List<User> users = userMapper.likeUserName(name);
//		if(users.size() > 0){//异常测试
////			throw new ServiceException("ERROR_SEARCH_FAILED");
//			throw new ServiceException("小主，查询失败了~-~");
//		}
		return users;
	}

	@Transactional
	public int addUser(User user) {
		int addNum = userMapper.addUser(user);
		int aa = 3/0;//异常测试
		return addNum;
	}
	
	@Transactional
	public int uptUserById(User user){
		int uptNum = userMapper.uptUserById(user);
		int i = 1/0;
		return uptNum;
	}
	
	@Transactional
	public int uptUserAgeById(String id){
		int uptNum = userMapper.uptUserAgeById(id);
		int i = 1/0;
		return uptNum;
	}
	
	@Transactional
	public int delUserById(String id){
		int delNum = userMapper.delUserById(id);
		int aa = 3/0;//异常测试
		return delNum;
	}
	
	public Map<String, Integer> testTran(User user, String id){
		int addNum = this.addUser(user);
		int delNum = this.delUserById(id);
		Map<String, Integer> data = new HashMap<String, Integer>();
		data.put("addNum", addNum);
		data.put("delNum", delNum);
		return data; 
	}

}
