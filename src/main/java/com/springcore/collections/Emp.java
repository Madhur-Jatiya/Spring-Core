package com.springcore.collections;

import java.util.*;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> emails;
	private Map<String, String> courses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", emails=" + emails + ", courses=" + courses + ", props="
				+ props + "]";
	}
	public Emp(String name, List<String> phones, Set<String> emails, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.emails = emails;
		this.courses = courses;
		this.props = props;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
