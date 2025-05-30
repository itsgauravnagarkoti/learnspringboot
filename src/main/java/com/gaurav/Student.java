package com.gaurav;

public class Student {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public Student() {
		
	}
	
	public Student(int id, String name, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	private String name;
	private String mobileno;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}

}
