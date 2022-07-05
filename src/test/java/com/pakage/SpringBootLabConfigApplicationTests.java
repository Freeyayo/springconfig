package com.pakage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pakage.pojo.Dog;
import com.pakage.pojo.Person;

@SpringBootTest
class SpringBootLabConfigApplicationTests {
	
	@Autowired
	private Dog dog;
	
	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
