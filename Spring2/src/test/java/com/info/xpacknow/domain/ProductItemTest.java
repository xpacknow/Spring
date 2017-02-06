package com.info.xpacknow.domain;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.info.xpacknow.domain.ProductItem;
import com.info.xpacknow.domain.Product;


public class ProductItemTest {
	
	private ProductItem productItem;

	@Before
	public void setup() {
		productItem = new ProductItem();
	}
	
	@Test
	public void ctotal_price() {
		
		//Ustaw
		Product phone = new Product(999,"Samsung S5", new BigDecimal(10));
		productItem.setProduct(phone);
		
		//Wykonaj
		BigDecimal cenaKoncowa = productItem.getTotalPrice();
		
		//Por�wnaj
		Assert.assertEquals(phone.getCenaZaSztuke(), cenaKoncowa);
	}	
}
