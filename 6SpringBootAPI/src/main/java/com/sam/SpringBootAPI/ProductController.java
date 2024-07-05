package com.sam.SpringBootAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("products")
	List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("productinfo")
	Product getProductInfo() {
		Product p = new Product(110, "Projector");
		return p;
	}

	@GetMapping("product/{id}")
	Product getProductById(@PathVariable("id") int productId) {
		System.err.println(productId);
		return productService.getProductById(productId);
	}

	@PostMapping("product")
	void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@DeleteMapping("product/{id}")
	void deleteProductByID(@PathVariable("id") int productId) {
		productService.deleteProductById(productId);
		System.err.println(productId);
	}

	@PutMapping("product")
	void updateProduct(@RequestBody Product product) {
		productService.updateOrCreateProduct(product);
	}


}
