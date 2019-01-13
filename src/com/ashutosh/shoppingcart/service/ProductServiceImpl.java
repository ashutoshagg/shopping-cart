package com.ashutosh.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashutosh.shoppingcart.dao.ProductDao;
import com.ashutosh.shoppingcart.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProduct(final int productId) {
		return productDao.getProduct(productId);
	}

}
