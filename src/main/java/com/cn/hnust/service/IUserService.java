package com.cn.hnust.service;

import java.util.Map;

import com.cn.hnust.pojo.User;

public interface IUserService {
	
	public User getUserById(int userId);

	public void insertUser(User user);

	public void updateByPrimaryKeySelective(User user);

	public User selectByConditon1(Map<String, Object> condition);
	
	public User selectByConditon2(Map<String, Object> condition);
	
}
