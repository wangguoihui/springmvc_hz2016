package com.cn.hnust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.hnust.dao.ICourseDao;
import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.ICourseService;

@Service("courseService")
public class CourseServiceImpl implements ICourseService {
	
	@Autowired
	private ICourseDao courseDao;
	
	@Override
	public User getUserById(int courseId) {
		return courseDao.selectByPrimaryKey(courseId);
	}

	@Override
	public void updateByPrimaryKeySelective(Course course) {
		courseDao.updateByPrimaryKeySelective(course);
	}
}














