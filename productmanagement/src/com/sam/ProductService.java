package com.sam;

import java.util.ArrayList;

public class ProductService {

	static ArrayList<Product> getAllProducts() throws Exception {
		return ProductDAO.getAllProducts();
	}

}
