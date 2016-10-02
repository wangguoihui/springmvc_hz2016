package com.cn.hnust.service.impl;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}
	
	@Override
	public void insertUser(User user) {
		userDao.insert(user);
		insert(user);
	}
	
	@Transactional
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public void updateByPrimaryKeySelective(User user) {
		userDao.updateByPrimaryKeySelective(user);
	}

	@Override
	public User selectByConditon1(Map<String, Object> condition) {
		return userDao.selectByConditon1(condition);
	}
	
	@Override
	public User selectByConditon2(Map<String, Object> condition) {
		return userDao.selectByConditon2(condition);
	}
}














