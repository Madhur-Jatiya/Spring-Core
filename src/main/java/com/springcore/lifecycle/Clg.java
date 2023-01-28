package com.springcore.lifecycle;

public class Clg {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Clg [subject=" + subject + "]";
	}
	
	
	public void start()
	{
		System.out.println("init method clg");
	}
	
	public void end()
	{
		System.out.println("destroy method clg");
	}
}
