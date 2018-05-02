package com.zzzz.manage.service;

import java.util.List;

import com.zzzz.manage.pojo.User;

public interface UserService {
	List<User> findAll();

	List<User> getAllUser();

	User getUser();

	void saveUser();
}
