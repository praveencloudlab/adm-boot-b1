package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.dao.ProductMySQLDaoImpl;
import com.cts.ecart.service.ProductService;

@SpringBootApplication
public class BootAutowireApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(BootAutowireApplication.class, args);
		
		//ProductDao prodDao = ac.getBean(ProductMySQLDaoImpl.class);
		
		ProductService ps = ac.getBean(ProductService.class);
		//ps.setProdDao(prodDao); // injecting/passing dependency (prodDao) to the dependent (ps) :: dependency injection
		
		ps.save();
		
		//prodDao.save();
		
		
	}

}
