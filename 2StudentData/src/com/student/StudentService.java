package com.student;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentService {
	static ArrayList<Student> fetchStudents() throws Exception {
		ArrayList<Student> alStudents = StudentDAO.fetchStudents();

		ListIterator<Student> it = alStudents.listIterator();
		while (it.hasNext()) {
			Student stu = it.next();
			if (!stu.name().toLowerCase().startsWith("a")) {
				it.remove();
			}
		}
		return alStudents;
	}
}
