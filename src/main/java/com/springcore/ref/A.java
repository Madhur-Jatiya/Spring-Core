package com.springcore.ref;

public class A {
	private int i;
	private B ob;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A(int i, B ob) {
		super();
		this.i = i;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [i=" + i + ", ob=" + ob + "]";
	}
	
}
