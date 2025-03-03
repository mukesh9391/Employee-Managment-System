package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class ProductDetails 
{
	@Id
	@Column(name = "product_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(name = "product_name",nullable = false )
private String productName;
	@Column(name = "product_price",nullable = false)
private double price;
private double discount;
@Column(name = "product_quantity",nullable = false)
private int quantity;
public ProductDetails() {
	super();
}
public ProductDetails(int id, String productName, double price, double discount, int quantity) {
	super();
	this.id = id;
	this.productName = productName;
	this.price = price;
	this.discount = discount;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "ProductDetails [id=" + id + ", productName=" + productName + ", price=" + price + ", discount=" + discount
			+ ", quantity=" + quantity + "]";
}

}
