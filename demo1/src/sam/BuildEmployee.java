package sam;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildEmployee {

	ArrayList<Employee> buildEmployee() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(1, "a", new Order(101, "o1")));
		emps.add(new Employee(2, "b", new Order(102, "o2")));
		emps.add(new Employee(3, "c", new Order(103, "o3")));
		return emps;
	}

	String[] getNames() {
		String[] names = new String[2];
		names[0] = "aa";
		names[1] = "bb";
//		names[2]="cc";

		return names;
	}

	Employee fetchEmployees() {
//		Employee e = new Employee();
//		e.name = "ss";
//		e.id = 101;

		Employee e = new Employee(3, "Jeesha", new Order(105, "o5"));
		return e;
	}

	public static void main(String[] args) {
		BuildEmployee be = new BuildEmployee();
		String[] names = be.getNames();
		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		for (String n : names) {
			System.out.println(n);
		}

		Employee emp = be.fetchEmployees();
		System.out.println(emp);
		System.out.println(emp.id);
		System.out.println(emp.name);

		System.out.println("--");
		System.out.println(be.buildEmployee());
	}

}
