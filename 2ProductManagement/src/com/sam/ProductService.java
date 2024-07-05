package com.sam;

import java.util.List;

public class ProductService {
	static List<Product> getAllProducts() throws Exception {
		return ProductDAO.getAllProducts();
	}
}
