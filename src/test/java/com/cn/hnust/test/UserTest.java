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
public class UserTest {
		
	@Autowired
	private IUserService userService;
	
	@Test
	public void update() {
		User user = new User();
		user.setId(1);
		user.setUserName("白晓乐");
		user.setPassword("123abc");
		user.setAge(2);
		try{
			userService.updateByPrimaryKeySelective(user);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
















