package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.ecart.entity.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	// 31 methods are available by default
	
}
