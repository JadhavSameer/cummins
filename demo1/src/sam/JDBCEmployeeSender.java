package sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCEmployeeSender {

	static ArrayList<Employee> fetchEmployees() throws Exception {
		// loading a class into memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		// mysql connector
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");
		String sql = "select * from employee";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<Employee> alemp = new ArrayList<Employee>();
		while (rs.next()) {
			int sid = rs.getInt(1);
			String sname = rs.getString(2);
//			System.out.println(sid + " " + sname);
			alemp.add(new Employee(sid, sname));
		}
//		System.out.println(alemp);
		return alemp;
	}

	public static void main(String[] args) throws Exception {
		fetchEmployees();
	}
}
