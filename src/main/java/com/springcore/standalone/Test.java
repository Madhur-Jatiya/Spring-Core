package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.constructorInjection.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/config.xml");
		Persons person = (Persons) context.getBean("person");
		System.out.println(person);
//		System.out.println(person.getFriend().getClass());
	}

}
