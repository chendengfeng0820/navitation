package com.navigation.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.navigation.mapper.UserMapper;
import com.navigation.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-02-21 12:52
 **/
@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/findAll")
	public String findAll() {
		List<User> users = userMapper.findAll();
		String Json = JSON.toJSONString(users);
		return Json;
	}

	@RequestMapping("/map")
	public String gaodemap(){
		String Json = JSON.toJSONString("https://www.amap.com/");
		return Json;
	}
	@RequestMapping("/updateUser")
	public String updateUser(@RequestBody JSONObject jsonObject) {
		User user = JSON.parseObject(jsonObject.toString(), User.class);
		Integer number=user.getNumber();
		user.setName(user.getName());
		user.setHeight(user.getHeight());
		user.setWeight(user.getWeight());
		user.setPressure(user.getPressure());
		user.setSugar(user.getSugar());
		userMapper.updateUser(user);
//		System.out.println(user);
		User user1=userMapper.findByNumber(number);
//		System.out.println(user1);
		float BMI = user1.getWeight() / (user1.getHeight() * user1.getHeight());
//		System.out.println(BMI);
		user1.setBmi(BMI);
		userMapper.updateUser(user1);
		return "t";
	}

}
