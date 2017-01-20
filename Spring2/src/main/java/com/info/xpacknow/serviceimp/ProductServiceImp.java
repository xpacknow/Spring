package com.info.xpacknow.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.xpacknow.domain.Product;
import com.info.xpacknow.repository.ProductRepository;
import com.info.xpacknow.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {

		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(long productID) {

		return productRepository.getProductById(productID);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);

	}

	@Override
	public void updateProduct(Product product, long id) {
		productRepository.updateProduct(product,id);
		
	}

	@Override
	public void delateProduct(long id) {

		productRepository.delateProduct(id);
	}

}
