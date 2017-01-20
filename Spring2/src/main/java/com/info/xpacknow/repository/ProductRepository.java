package com.info.xpacknow.repository;

import java.util.List;

import com.info.xpacknow.domain.Product;
;

public interface ProductRepository {

	List<Product> getAllProducts();

	Product getProductById(long productID);

	void addProduct(Product product);
	
	void updateProduct (Product product, long id);
	
	void delateProduct (long id);
	
	
	
}
