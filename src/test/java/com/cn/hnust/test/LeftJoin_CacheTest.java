package com.cn.hnust.test;

import java.util.HashMap;
import java.util.Map;

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
public class LeftJoin_CacheTest {
		
	@Autowired
	private IUserService userService;
	
	@Test
	public void select() {
		Map<String,Object> condition = new HashMap<String,Object>();
		condition.put("id", 1);
		User user = userService.selectByConditon2(condition);
		System.out.println(user);
	}
}
















