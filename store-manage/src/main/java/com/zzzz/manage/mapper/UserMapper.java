package com.zzzz.manage.mapper;

import java.util.List;

import com.zzzz.manage.pojo.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	List<User> findAll();
}
