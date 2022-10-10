package com.cts.ecart.dao;

import org.springframework.stereotype.Repository;

@Repository
//dependency
public class ProductMySQLDaoImpl implements ProductDao {
	
	@Override
	public void save() {
		System.out.println(">>> DAO :: saving product to MYSQL DB");
	}
	
}
