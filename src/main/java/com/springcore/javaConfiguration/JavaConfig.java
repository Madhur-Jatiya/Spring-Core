package com.springcore.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaConfiguration")
public class JavaConfig {

	@Bean
	public Person getPerson() {
		Person person = new Person();
		return person;
	}

	@Bean(name = { "madhur", "lokesh", "deepak" })
	public DerivePerson getdeDerivePerson() {
		DerivePerson derivePerson = new DerivePerson(getPerson());
		return derivePerson;
	}

}
