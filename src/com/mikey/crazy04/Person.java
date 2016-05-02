package com.mikey.crazy04;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	private String name;
	private transient int age;
	public Person(String name, int age){
		System.out.println("有参数的构造器");
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
