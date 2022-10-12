package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.cts.ecart.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired 
	@Qualifier(value = "productMySQLDaoImpl")
	private ProductDao prodDao; // make sure ProductDao should have single class IMPL
	//in case of ProductDao interface having more than 1 IMPL classes, then  use 'Qualifier' annotation

	@Override
	public void save() {
		System.out.println(">>> SERVICE :: save method");
		prodDao.save(); 
	}
	
	

}
