package com.cn.hnust.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.hnust.pojo.Course;
import com.cn.hnust.service.ICourseService;

/**
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Service
public class CourseTest {
		
	@Autowired
	private ICourseService courseService;
	
	@Test
	public void update() {
		Course course = new Course();
		course.setId(4);
		course.setcName("历史");
		course.setScore(88);
		course.setTeacher("饶仁娟");
		course.setUid(1);
		try{
			courseService.updateByPrimaryKeySelective(course);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
















