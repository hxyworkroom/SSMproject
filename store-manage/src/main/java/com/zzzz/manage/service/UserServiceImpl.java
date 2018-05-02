package com.zzzz.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzzz.manage.mapper.UserMapper;
import com.zzzz.manage.pojo.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}
	
	public List<User> getAllUser(){
		return userMapper.selectAll();
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(3);
		return userMapper.selectOne(user);
	}

	@Override
	public void saveUser() {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName(System.currentTimeMillis()+"");
		userMapper.insert(user);
		System.out.println("新加入的user的id是："+user.getId());
	}

}
