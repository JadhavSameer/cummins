package com.sam;

import java.util.ArrayList;

public class ProductController {
	static ArrayList<Product> getAllProducts() throws Exception {
		return ProductService.getAllProducts();
	}
}
