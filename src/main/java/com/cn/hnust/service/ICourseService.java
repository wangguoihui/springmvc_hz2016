package com.cn.hnust.service;

import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.User;

public interface ICourseService {
	
	public User getUserById(int userId);

	public void updateByPrimaryKeySelective(Course course);
	
}
