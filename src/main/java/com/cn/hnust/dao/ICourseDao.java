package com.cn.hnust.dao;

import java.util.List;
import java.util.Map;

import com.cn.hnust.pojo.Course;
import com.cn.hnust.pojo.User;

public interface ICourseDao {
	
    int deleteByPrimaryKey(Integer id);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course course);

    int updateByPrimaryKey(Course course);
    
    List<User> selectByConditon(Map<String, Object> condition);

}