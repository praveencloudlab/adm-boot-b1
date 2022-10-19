package com.cts.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "products") // products name of table
public class Product {

	@Id
	@GeneratedValue
	private int productId; // product_id
	private String productName; // product_name
	private double price; // price
	// @Column(name="prodDesc")
	private String description; // description

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, double price, String description) {
		this.productName = productName;
		this.price = price;
		this.description = description;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", description=" + description + "]";
	}

}
