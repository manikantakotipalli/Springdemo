package com.hello;

public class Student {

	int id;
	String s;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", s=" + s + "]";
	}
	
	
	
}
