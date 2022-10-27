package com.cts.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockInfo {
	@Id
	@GeneratedValue
	private int stockId;
	private int stock;

	public StockInfo() {
		// TODO Auto-generated constructor stub
	}

	public StockInfo(int stock) {
		super();
		this.stock = stock;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "StockInfo [stockId=" + stockId + ", stock=" + stock + "]";
	}

}
