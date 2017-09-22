package com.szl.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.container.Main;
import com.szl.dubbo.api.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String sayHello(String name) {
		return "hello " + name + ",欢迎来到dubbo的世界";
	}
	
	/**
	 * 2种启动方法
	 * @author ZhangLiang Song
	 * @date 2017年9月22日 下午2:43:11
	 * @param args
	 */
	
//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:user-provider.xml");
//		context.start();
//	}
	
	public static void main(String[] args) {
		Main.main(args);
	}

}
