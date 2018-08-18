package com.spring.learn;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}
	
	public void helloSay() {
		System.out.println("hello:"+name);
	}

	public void setName(String name) {
		System.out.println("this is setName...");
		this.name = name;
	}


	public HelloWorld() {
		System.out.println("this is constructer...");
	}
}
