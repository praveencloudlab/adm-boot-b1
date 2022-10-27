package com.cts.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PriceInfo {

	@Id
	@GeneratedValue
	private int priceId;
	private double price;
	
	public PriceInfo() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PriceInfo(double price) {
		super();
		this.price = price;
	}



	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PriceInfo [priceId=" + priceId + ", price=" + price + "]";
	}

}
