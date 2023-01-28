package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoconfig.xml");
		Swiggy swiggy = (Swiggy) context.getBean("swiggy");
		System.out.println(swiggy);
	}

}
