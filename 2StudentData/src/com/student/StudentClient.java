package com.student;

import java.util.ArrayList;

public class StudentClient {
	public static void main(String[] args) throws Exception {
		ArrayList<Student> students = StudentController.fetchStudents();
		for (Student s : students) {
			System.out.println("id=" + s.id() + "\tname=" + s.name());
		}

	}
}
