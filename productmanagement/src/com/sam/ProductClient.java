package com.sam;

import java.util.ArrayList;

public class ProductClient {
	public static void main(String[] args) {

		// CLient application will request for data

		ArrayList<Product> prods = null;
		try {
			prods = ProductController.getAllProducts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Product product : prods) {
			System.out.println(product);
		}

	}
}
