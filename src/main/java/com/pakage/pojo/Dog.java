package com.pakage.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
	@Value("DD")
	private String name;
	@Value("14")
	private Integer age;
	
	public Dog() {
		
	}
	
	public Dog (String name, Integer age) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return "Dog: "+ name + ", Age: "+ age;
	}
}
