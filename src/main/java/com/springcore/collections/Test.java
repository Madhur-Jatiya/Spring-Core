package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/Empconfig.xml");
        Emp emp1 = (Emp) context.getBean("Emp1");
        System.out.println(emp1);
        System.out.println("Name = " + emp1.getName());
        System.out.println("Phones = " + emp1.getPhones());
        System.out.println("Emails = " + emp1.getEmails());
        System.out.println("Courses = " + emp1.getCourses());
        System.out.println("Props = " + emp1.getProps());
	}

}
