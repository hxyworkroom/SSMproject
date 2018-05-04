package cn.hy.manage.mapper;

import java.util.List;

import cn.hy.manage.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	List<User> findAll();
}
