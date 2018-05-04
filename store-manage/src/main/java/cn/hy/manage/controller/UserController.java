package cn.hy.manage.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.hy.manage.pojo.User;
import cn.hy.manage.service.UserService;

@Controller
@RequestMapping("User")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String restfulpage(){
		System.out.println("进入restful测试页面！");
		return "restful";
	}
	
	@RequestMapping("/findAllUser")
	public String index(){
		System.out.println("开始查询已经注册的所有用户！");
		return "ok";
	}
	
	@RequestMapping(value="/findUserByCondition/1/{id}",method=RequestMethod.GET)
	public String findAllUserById(){
		System.out.println("按用户ID进行查询！");
		List<User> ls=userService.findAll();
		for (User user : ls) {
			System.out.println(user.toString());
		}
		return "ok";
	}
	@RequestMapping(value="/findUserByCondition/2/{username}",method=RequestMethod.GET)
	public String findAllUserByUsername(){
		System.out.println("按用户ID进行查询！");
		List<User> ls=userService.findAll();
		for (User user : ls) {
			System.out.println(user.toString());
		}
		return "ok";
	}
	@RequestMapping(value="/findUserByCondition/3/{userdepartment}",method=RequestMethod.GET)
	public String findAllUserByUserdepartment(){
		System.out.println("按用户ID进行查询！");
		List<User> ls=userService.findAll();
		for (User user : ls) {
			System.out.println(user.toString());
		}
		return "ok";
	}
//---------------------------------------------------------分割线---------------------------------------------------------
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












