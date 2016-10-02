package com.cn.hnust.dao;

import java.util.Map;

import com.cn.hnust.pojo.User;

public interface IUserDao {
	
    int deleteByPrimaryKey(Integer id);

    public void insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByConditon1(Map<String, Object> condition);
    
    User selectByConditon2(Map<String, Object> condition);


}