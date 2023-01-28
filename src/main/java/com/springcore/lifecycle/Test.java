package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/sconfig.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/sconfig.xml");
//		Samosa samosa = (Samosa) context.getBean("samosa1");
//		System.out.println(samosa+"\n");
		context.registerShutdownHook();
//		
//		Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
//		System.out.println(pepsi);
		
		Clg clg = (Clg) context.getBean("clg");
		System.out.println(clg);
	}

}
