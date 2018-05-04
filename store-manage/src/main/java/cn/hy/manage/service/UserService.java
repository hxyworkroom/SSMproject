package cn.hy.manage.service;

import java.util.List;

import cn.hy.manage.pojo.User;

public interface UserService {
	List<User> findAll();

	List<User> getAllUser();

	User getUser();

	void saveUser();
}
