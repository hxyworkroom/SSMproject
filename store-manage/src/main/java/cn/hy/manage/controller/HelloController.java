package cn.hy.manage.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hy.manage.pojo.User;
import cn.hy.manage.service.UserService;

@Controller
@RequestMapping("hello")
public class HelloController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		System.out.println("mvc整合成功！");
		return "ok";
	}
	@RequestMapping("/findAllUser")
	public String findAllUser(){
		System.out.println("现在查询所有用户！");
		List<User> ls=userService.findAll();
		for (User user : ls) {
			System.out.println(user.toString());
		}
		return "ok";
	}
	
	@RequestMapping("/TYfindUser")
	public String TYfindUser(){
		System.out.println("通用mapper测试！");
		List<User> ls=userService.getAllUser();
		for (User user : ls) {
			System.out.println("~~~"+user.toString()+"~~~");
		}
		return "ok";
	}
	
	
	@RequestMapping("/TYfindByUserId")
	public String TYfindByUserId(){
		System.out.println("通用mapper查询指定用户！");
		User user=userService.getUser();
		System.out.println("~one~"+user.toString()+"~one~");
		return "ok";
	}
	
	@RequestMapping("/TYaddUser")
	public String TYaddUser(){
		System.out.println("测试添加用户！");
		userService.saveUser();
		System.out.println("添加成功！");
		return "ok";
	}
	
	
}












