package com.cn.hnust.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public ArrayList<Course> getCourse() {
		return courses;
	}

	public void setCourse(ArrayList<Course> courses) {
		this.courses = courses;
	}

	private static final long serialVersionUID = 1L;

	private Integer id;

    private String userName;

    private String password;

    private Integer age;
    
    private ArrayList<Course> courses;
    
}













