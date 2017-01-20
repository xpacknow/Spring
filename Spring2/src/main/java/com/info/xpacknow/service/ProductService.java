package com.info.xpacknow.service;

import java.util.List;


import com.info.xpacknow.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(long productID);

	void addProduct(Product produkt);

void updateProduct (Product product, long id);
	
	void delateProduct (long id);
}
