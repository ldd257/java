package com.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMAIN {

	public static void main(String[] args) {
		/*// 1.��������
		HelloWorld world = new HelloWorld();
		// 2.������ֵ
		world.setName("ldd");*/
		
		// ����spring����   spring�Ƕ�bean���д�����ά��
		// 1.��������
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.�������л�ȡ����
		HelloWorld world = (HelloWorld)context.getBean("helloWorld");
		// 3.���÷���
		world.helloSay();
	}
	
}
