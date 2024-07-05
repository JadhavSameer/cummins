package sam;

import java.util.ArrayList;

public class JDBCEmployeeReceiver {
	public static void main(String[] args) {
		try {
			ArrayList<Employee> emps = JDBCEmployeeSender.fetchEmployees();
			for (Employee e : emps) {
				System.out.print(e.id + " " + e.name);
				System.out.println();
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
