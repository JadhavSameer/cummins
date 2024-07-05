package sam;

import java.util.ArrayList;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sameer");
		al.add("snehal");
		
		System.out.println(al);
		
		for (String s : al) {
			System.out.println(s);
		}
	}
}
