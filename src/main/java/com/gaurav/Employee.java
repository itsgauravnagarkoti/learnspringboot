package com.gaurav;

public class Employee {
	
	int id;

	static String CompanyName;
	
	public static void main(String[] args) {
		Employee.CompanyName = "SoftWare Company";
		Employee e = new Employee();
		e.id = 1233;
		System.out.println(CompanyName);
	}
}
