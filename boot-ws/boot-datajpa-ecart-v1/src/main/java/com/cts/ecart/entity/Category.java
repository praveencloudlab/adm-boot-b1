package com.cts.ecart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "categories")
public class Category {
	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryTitle;

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryTitle) {
		super();
		this.categoryTitle = categoryTitle;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

}
