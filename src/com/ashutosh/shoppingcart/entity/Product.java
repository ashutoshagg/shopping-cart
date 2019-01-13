package com.ashutosh.shoppingcart.entity;

public class Product {
	private int id;
	private String name;
	private String color;
	private int price;
	private int availabe_quantity;
	
	public Product() {
		
	}

	public Product(int id, String name, String color, int price, int availabe_quantity) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.availabe_quantity = availabe_quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAvailabe_quantity() {
		return availabe_quantity;
	}

	public void setAvailabe_quantity(int availabe_quantity) {
		this.availabe_quantity = availabe_quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", availabe_quantity="
				+ availabe_quantity + "]";
	}
	
	
	
}
