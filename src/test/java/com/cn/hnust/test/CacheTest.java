package com.cn.hnust.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

/**
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Service
public class CacheTest {
		
	@Autowired
	private IUserService userService;
	
	@Test
	public void select() {
		User user = userService.getUserById(1);
		System.out.println(user);
	}
	
//	@Test
//	public void update() {
//		User user = new User();
//		user.setId(1);
//		user.setUserName("白晓乐");
//		try{
//			userService.updateUserById(user);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
}
















