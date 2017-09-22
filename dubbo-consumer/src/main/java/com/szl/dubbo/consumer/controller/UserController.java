package com.szl.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.szl.dubbo.api.UserService;

@RestController
@RequestMapping(value = "user", produces = "application/json; charset=UTF-8")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "")
	public String sayHello(@RequestParam(name = "name", defaultValue = "访客") String name) {
		return userService.sayHello(name);
	}

}
