package com.iyunr.controllerTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iyunr.Application;
import com.iyunr.entity.User;
import com.iyunr.service.UserSer;
import com.iyunr.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)	// SpringJUnit支持，由此引入Spring-Test框架支持！ 
@SpringBootTest(classes = Application.class)	// 指定我们SpringBoot工程的Application启动类
public class HelloTest {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserSer userSer;
	
	@Test
	public void getUserByNameTest(){
		String name = "tom";
		List<User> data = userService.likeUserName(name);
		System.out.println(data);
	}
	
	@Test
	public void addUser(){
		User user = new User();
		user.setId("100");
		user.setAge(14);
		user.setName("test");
		
		int addNo = userSer.addUser(user);
		System.out.println(addNo);
	}
	
	@Test
	public void uptUserAgeById(){
		int uptNo = userSer.uptUserAgeById("100");
		System.out.println(uptNo);
	}
	
	/**
	 * @Description: TODO 这个测试就是不能实现事务回滚的 
	 * @Title: uptUser 
	 * @param     参数  
	 * @return void    返回类型  
	 * @throws
	 */
	@Test
	public void uptUser(){
		User user = new User();
		user.setId("100");
		user.setAge(100);
		user.setName("test");
		int uptNo = userSer.uptUserById(user);
		System.out.println(uptNo);
	}
	
	/**
	 * @Description: TODO 这个测试就可以实现事务的回滚，问题是只差了一个实现类而已
	 * @Title: uptUser1 
	 * @param     参数  
	 * @return void    返回类型  
	 * @throws
	 */
	@Test
	public void uptUser1(){
		User user = new User();
		user.setId("100");
		user.setAge(100);
		user.setName("test");
		int uptNo = userService.uptUserById(user);
		System.out.println(uptNo);
	}
}
