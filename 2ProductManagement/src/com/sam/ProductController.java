package com.sam;

import java.util.List;

public class ProductController {

	static List<Product> getAllProducts() throws Exception {
		return ProductService.getAllProducts();
	}
}
