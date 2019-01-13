package com.ashutosh.shoppingcart.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashutosh.shoppingcart.customexception.OutOfStockException;
import com.ashutosh.shoppingcart.entity.CartItem;
import com.ashutosh.shoppingcart.service.ProductService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/show")
	public String showCart(HttpSession httpSession) {
		List<CartItem> cart = (List<CartItem>) httpSession.getAttribute("cart");
		httpSession.setAttribute("cart", cart);
		return "show-cart";
	}
	
	@RequestMapping("/add/{id}")
	public String addToCart(@PathVariable("id") int productId, HttpSession httpSession) {
		if (httpSession.getAttribute("cart") == null) {
			List<CartItem> cart = new ArrayList<>();
			cart.add(new CartItem(productService.getProduct(productId), 1));
			httpSession.setAttribute("cart", cart);
		}
		else {
			List<CartItem> cart = (List<CartItem>) httpSession.getAttribute("cart");
			int index = this.ifExists(cart, productId);
			if(index == -1) {
				cart.add(new CartItem(productService.getProduct(productId), 1));
			}
			else {
				int quantity = cart.get(index).getQuantity() + 1;
				if(cart.get(index).getProduct().getAvailabe_quantity() < quantity) 
					throw new OutOfStockException("Item is out of stock");
				cart.get(index).setQuantity(quantity);
			}
			httpSession.setAttribute("cart", cart);
		}
		return "redirect:/products/list";
	}
	
	@RequestMapping("/remove/{id}")
	public String removeItemFromCart(@PathVariable("id") int productId, HttpSession httpSession) {
		List<CartItem> cart = (List<CartItem>) httpSession.getAttribute("cart");
		int index = this.ifExists(cart, productId);
		cart.remove(index);
		httpSession.setAttribute("cart", cart);
		return "redirect:/cart/show";
	}

	private int ifExists(final List<CartItem> cart, final int productId) {
		for(int i = 0; i < cart.size(); i++) {
			if(cart.get(i).getProduct().getId() == productId) 
				return i;
		}
		return -1;
	}
}
