package com.student;

import java.util.ArrayList;

public class StudentController {
	static ArrayList<Student> fetchStudents() throws Exception {
		ArrayList<Student> alStudents = StudentService.fetchStudents();
		return alStudents;
	}
}
