package com.springcore.javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = (Student) context.getBean("mj");
		student.studentNames();
		Thread.currentThread().setName("deepak");

		DerivePerson derivePerson = (DerivePerson) context.getBean("madhur");
		derivePerson.display();
	}

}
