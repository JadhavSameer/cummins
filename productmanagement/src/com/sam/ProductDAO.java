package com.sam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {

	static ArrayList<Product> getAllProducts() throws Exception {
		ArrayList<Product> al = new ArrayList<Product>();

		// fetch products from db
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb", "root", "manager@1990");
		Statement stmt = conn.createStatement();

		String sql = "select * from products";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " "+ rs.getString(2));
			int id = rs.getInt(1);
			String name = rs.getString(2);
			al.add(new Product(id, name));
		}
//		al.add(new Product(101, "aa"));
//		al.add(new Product(102, "bb"));
		return al;
	}

}
