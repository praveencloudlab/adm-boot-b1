package com.cts.ecart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import com.cts.ecart.dao.ProductDao;

@SpringBootApplication
public class BootDatajpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(BootDatajpaApplication.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);

	//	Product prod = new Product("Dell Laptop", 96500, "Dell XPS I3");
		
	//	prodDao.save(prod); // add new record
		
		//Product prod = prodDao.findById(5).orElse(null);
		
		//if(prod!=null)
	    //prodDao.delete(prod);
		//prod.setProductName("Dell Laptop");

		//prodDao.save(prod); // update
		
		
		/*
		 Product prod = prodDao.findById(3).orElse(null);
		 
		if(prod!=null) {
			System.out.println(prod);
		}else {
			System.out.println("no record found");
		}
		
		*/
		
		// find all records
		
		/*
		List<Product> prods = prodDao.findAll();
		for(Product prod:prods) {
			System.out.println(prod);
		}
		*/
		
	  //  prodDao.findAll().forEach(System.out::println);
		
		// find and filter
		
		//Stream<Product> prods = prodDao.findAll().stream();
		
		//List<Product> filteredProds = prods.filter(prod->prod.getPrice()>=15000).collect(Collectors.toList());
		
		//filteredProds.forEach(System.out::println);
		
		prodDao.findAll(Sort.by(Sort.Direction.ASC,"productName")).forEach(System.out::println);
		
		
			

	}

}
