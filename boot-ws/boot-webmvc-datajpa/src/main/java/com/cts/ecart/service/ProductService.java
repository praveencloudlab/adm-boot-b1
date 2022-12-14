package com.cts.ecart.service;

import java.util.List;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Product;

public interface ProductService {
	
	List<Brand> findAllBrands();
	List<Category> findAllCategories();
	
	Product saveProduct(Product product);
	Product findById(int productId);
	List<Product> findAll();
	List<Product> findByProductTitle(String productTitle);
	List<Product> findByPriceRange(double startRange,double endRange);
	List<Product> findByPriceGreater(double price);
	List<Product> findBypriceLesser(double price);
	List<Product> findByBrandTitle(String brandTitle);
	List<Product> findByBrandId(int brandId);
	List<Product> findByCategoryTitle(String categoryTitle);
	List<Product> findByCategoryId(int categoryId);
	

}
