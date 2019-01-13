package com.ashutosh.shoppingcart.dao;

import java.util.List;

import com.ashutosh.shoppingcart.entity.Product;

public interface ProductDao {
	public List<Product> getAllProducts();
	public Product getProduct(int productId);
}
