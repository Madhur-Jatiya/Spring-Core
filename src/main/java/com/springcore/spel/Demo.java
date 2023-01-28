package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	
	@Value("#{2+3}")
	private int x;
	
	@Value("#{2>3?7:8}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	public double getPi() {
		return pi;
	}
	public void setPi(int pi) {
		this.pi = pi;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + " PI = " + getPi() + "]";
	}
}
