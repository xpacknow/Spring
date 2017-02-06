package com.info.xpacknow.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductItem implements Serializable{

	private static final long serialVersionUID = -4314427089896169685L;
	
	private Product product;
	private int quantity;
	private BigDecimal totalPrice;
	
	public ProductItem() {
		this.quantity = 1;
	}
	
	public ProductItem(Product product) {
		super();
		this.product = product;
		this.quantity = 1;
		this.totalPrice = product.getCenaZaSztuke();
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
		this.updateTotalPrice();
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		totalPrice = this.product.getCenaZaSztuke().multiply(new BigDecimal(this.quantity));
	}
	
	@Override
	public int hashCode() {
		final int prime = 311;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductItem other = (ProductItem) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
}