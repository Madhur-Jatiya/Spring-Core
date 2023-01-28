package com.springcore.standalone;

import java.util.List;

public class Persons {
	private List<String> friend;
	
	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}


	@Override
	public String toString() {
		return "Person [Friend =" + friend + "]";
	}
	
}
