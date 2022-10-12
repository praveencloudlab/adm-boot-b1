package com.cts.ecart.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class ProductMySQLDaoImpl implements ProductDao {
	
	@Override
	public void save() {
		System.out.println(">>> DAO :: saving product to MYSQL DB");
	}
	
}
