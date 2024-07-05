package collegemanagement;

import java.util.ArrayList;

public class CollegesData {

	ArrayList<String> getCollegeNames() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Cummins");
		names.add("MMCOE");
		names.add("MIT");
		names.add("Sinhagad");
		return names;
	}

	ArrayList<College> getColleges() {
		ArrayList<College> al = new ArrayList<>();
		College c1 = new College(102, "MMCOE");
//		al.add(c);
		al.add(c1);
		return al;
	}

}
