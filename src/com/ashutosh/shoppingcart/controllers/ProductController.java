package com.ashutosh.shoppingcart.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashutosh.shoppingcart.entity.Product;
import com.ashutosh.shoppingcart.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/list")
	public String getAllProducts(Model model) {
		List<Product> productList = productService.getAllProducts();
		//List<Product> productList = new ArrayList<>();
		model.addAttribute("products", productList);
		return "product-list";		
	}
	
	@RequestMapping("/product/{id}")
	public String getProduct(@PathVariable("id") int productId, Model model) {
		Product product = productService.getProduct(productId);
		model.addAttribute("product", product);
		return "product-detail";
	}

}
