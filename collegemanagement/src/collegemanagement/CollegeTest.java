package collegemanagement;

import java.util.ArrayList;

public class CollegeTest {
	public static void main(String[] args) {

		CollegesData cd = new CollegesData();
		ArrayList<String> ls = cd.getCollegeNames();

		for (String name : ls) {
//			System.out.println(name);
		}

		ArrayList<College> colleges = cd.getColleges();
//		System.out.println(college);
//		System.out.println(college.getId());
//		System.out.println(college.getName());

		for (College c : colleges) {
			System.out.println(c.id() + " "+ c.name());
		}
	}
}
