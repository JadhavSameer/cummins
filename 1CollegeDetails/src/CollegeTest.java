import java.util.ArrayList;

public class CollegeTest {
	public static void main(String[] args) {

		CollegeData cd = new CollegeData();
		ArrayList<String> colleges = cd.fetchColleges();

		for (String college : colleges) {
//			System.out.println(college);
		}

//		College college = cd.fetchCollege();
//		System.out.println(college);
//		System.out.println(college.getBranches());
//		System.out.println(college.getName());

		ArrayList<College> al = cd.fetchAllCollege();
		for (College college : al) {
			System.out.println(college);
		}

	}
}
