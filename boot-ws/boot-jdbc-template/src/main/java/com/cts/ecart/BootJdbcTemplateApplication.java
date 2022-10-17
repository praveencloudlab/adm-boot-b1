package com.cts.ecart;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.dao.ProductDaoImpl;
import com.cts.ecart.dao.ProductDaoLamdaImpl;
import com.cts.ecart.model.Product;

@SpringBootApplication
public class BootJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootJdbcTemplateApplication.class, args);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
	//	Map<String, Object> prod = prodDao.findById(388);
		
		/*
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("No record Found");
		}
		*/
		
		//prodDao.fetchAll().forEach(System.out::println);
		
		//prodDao.findAll().forEach(System.out::println);
		
		/*
		Product prod = prodDao.findProductById(306);
		if(prod!=null) {
		System.out.println(prod);
		}else {
			System.out.println("No record Found");
		}
		
		*/
		
		//prodDao.listAllProducts().forEach(System.out::println);
		
		
		/*
		Product p1=new Product();
		p1.setId(40);
		p1.setName("Pen");
		p1.setDescription("Red Ink");
		p1.setPrice(45.87);
		
		
		
		prodDao.save(p1);
		
		*/
		
		
		/*

		 ProductDao p1=()->{
			 System.out.println("saving pen");
		 };
		 
		 
		 ProductDao p2=()->{
			 System.out.println("saving book");
		 };
		 
		 p1.save();
		 p2.save();
		 
		 */
		
		ProductDaoLamdaImpl dao = ac.getBean(ProductDaoLamdaImpl.class);
		//Product prod = dao.findById(36);
		 
		//System.out.println(prod);
		
		
		
		dao.findAll().forEach(System.out::println);
		
		
		
		
		
	}

}
