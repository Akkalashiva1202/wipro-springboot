package com.example.restapi.model;

public class Product {

	int prodid;
	float price;
	int qty;
	String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodid, float price, int qty, String name) {
		super();
		this.prodid = prodid;
		this.price = price;
		this.qty = qty;
		this.name = name;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", price=" + price + ", qty=" + qty + ", name=" + name + "]";
	}
	
	
}
