package com.springcore.javaConfiguration;

public class DerivePerson {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public DerivePerson(Person person) {
		super();
		this.person = person;
	}
	
	public void display()
	{
		person.personNames();
	}
	
	
}
