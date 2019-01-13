package com.ashutosh.shoppingcart.customexception;

public class OutOfStockException extends RuntimeException{
	
	public OutOfStockException(String message) {
		super(message);
	}

}
