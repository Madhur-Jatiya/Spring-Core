package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		B b = (B) context.getBean("bref");
		System.out.println(a);
		System.out.println(b);
		System.out.println("y = " + b.getY());
		System.out.println("i = " + a.getI());
		System.out.println("y = " + a.getOb().getY());
	}

}
