package com.springcore.constructorInjection;

public class Certificate {
	private String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
