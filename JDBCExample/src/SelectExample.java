import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		conn.close();
	}
}
