package com.ashutosh.shoppingcart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ashutosh.shoppingcart.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private List<Product> productList;
	
	public ProductDaoImpl() {
		this.productList = new ArrayList<>();
		this.productList.add(new Product(1, "Product 1", "Blue", 20, 5));
		this.productList.add(new Product(2, "Product 2", "Black", 30, 2));
		this.productList.add(new Product(3, "Product 3", "Red", 10, 3));
	}

	@Override
	public List<Product> getAllProducts() {
		return this.productList;
	}

	@Override
	public Product getProduct(final int productId) {
		for(Product product : this.productList) {
			if(product.getId() == productId) {
				return product;
			}
		}
		return null;
	}

}
