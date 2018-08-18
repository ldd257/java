package com.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMAIN {

	public static void main(String[] args) {
		/*// 1.创建对象
		HelloWorld world = new HelloWorld();
		// 2.给对象赋值
		world.setName("ldd");*/
		
		// 采用spring方法   spring是对bean进行创建和维护
		// 1.创建容器
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.从容器中获取对象
		HelloWorld world = (HelloWorld)context.getBean("helloWorld");
		// 3.调用方法
		world.helloSay();
	}
	
}
