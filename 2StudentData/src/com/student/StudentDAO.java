package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {

//	insert into student values(1,'aa',101);
//	delete from student where id=1;
//	update student set id=102 where id=2;

	public static void deleteStudent(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");
		String sql = "delete from student where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		int rowcount = ps.executeUpdate();
		if (rowcount > 0) {
			System.out.println("Record " + id + " deleted");
		}
	}

	public static void insertStudent(int id, String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");

		String sql = "insert into student values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);

		int rowcount = ps.executeUpdate();
		if (rowcount > 0) {
			System.out.println("Record " + id + " inserted");
		}
	}

	public static ArrayList<Student> fetchStudents() throws Exception {
		ArrayList<Student> al = new ArrayList<Student>();
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");
		Statement stmt = conn.createStatement();
		String sql = "select * from student";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(id + " " + name);
			al.add(new Student(id, name));
		}
		return al;
	}

	public static void main(String[] args) throws Exception {
		fetchStudents();
		insertStudent(104, "a1a1");
		fetchStudents();
		deleteStudent(104);
		fetchStudents();
	}
}
