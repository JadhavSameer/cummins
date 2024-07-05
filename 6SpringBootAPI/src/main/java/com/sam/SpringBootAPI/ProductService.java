package com.sam.SpringBootAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int productId) {
		return productRepository.findById(productId).orElse(null);
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProductById(int productId) {
		productRepository.deleteById(productId);
	}

	public void updateOrCreateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		if (existingProduct == null) {
			productRepository.save(product);
		} else {
			existingProduct.setId(product.getId());
			existingProduct.setName(product.getName());
			productRepository.save(existingProduct);
		}
	}

}
