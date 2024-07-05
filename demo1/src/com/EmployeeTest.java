package com;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("aa", 1000);
		e.calculateSalary();

		Employee e1 = new RegularEmployee("bb", 1000);
		e1.calculateSalary();
	}
}
