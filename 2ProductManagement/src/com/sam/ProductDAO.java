package com.sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	static List<Product> getAllProducts() throws Exception {
		ArrayList<Product> al = new ArrayList<Product>();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");

		Statement stmt = conn.createStatement();
		String sql = "select * from products";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			al.add(new Product(id, name));
		}
		return al;
	}
}
