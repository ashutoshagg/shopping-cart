package com.ashutosh.shoppingcart.service;

import java.util.List;

import com.ashutosh.shoppingcart.entity.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProduct(final int productId);
}
