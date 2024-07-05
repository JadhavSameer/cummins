package com;

public class RegularEmployee extends Employee {

	public RegularEmployee(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void calculateSalary() {
		System.out.println("Regular Employee Name: " + name + " Salary: " + salary * 1.01);
	}
}
