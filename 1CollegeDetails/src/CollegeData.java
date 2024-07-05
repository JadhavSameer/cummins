import java.util.ArrayList;

public class CollegeData {
	ArrayList<String> fetchColleges() {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Cummins");
		al.add("MMCOE");
		al.add("MIT");

		return al;
	}

	ArrayList<College> fetchAllCollege() {
		
		ArrayList<College> al = new ArrayList<College>();
		
		College c = new College();
		c.setBranches(5);
		c.setName("Cummins");

		College c1 = new College(4, "MMCOE");

		al.add(c);
		al.add(c1);
		return al;
	}



}
