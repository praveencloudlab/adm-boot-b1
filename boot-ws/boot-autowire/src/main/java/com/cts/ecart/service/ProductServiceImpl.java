package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.dao.ProductDao;


@Service
//dependent
public class ProductServiceImpl implements ProductService{
	
	/*
	 *  autowire
	 *  ----------
	 *  -> injecting dependencies to the dependent objects
	 *  -> two types of autowire
	 *  	1. setter based autowireing : method can be called/invoked multiple times on same object. It injects multiple times for each invocation on a single object
	 *  	2. constructor based autowiring : to inject dependency to the dependent only one time on top of a object
	 * 
	 * 
	 * 
	 */
	
	//@Autowired // inject dependency (prodDao) to the dependent (product-service) : DI
	private ProductDao prodDao; // setter based / filed based autowire
	
	@Autowired // constructor based autowire
	public ProductServiceImpl(ProductDao prodDao) {
		this.prodDao=prodDao;
	}
	

	@Override
	public void save() {
		System.out.println(">>> SERVICE :: save method");
		prodDao.save(); // calls save method of dao class
	}

}
