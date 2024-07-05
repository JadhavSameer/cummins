package com.sam;

import java.util.List;

public class ProductClient {
	public static void main(String[] args) throws Exception {

		// get all products
		List<Product> prods = ProductController.getAllProducts();
		for (Product product : prods) {
			System.out.println(product);
		}

	}
}
