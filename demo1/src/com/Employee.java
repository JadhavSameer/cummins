package com;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void calculateSalary() {
		System.out.println("Employee Name: " + name + " Salary: " + salary);
	}
}
