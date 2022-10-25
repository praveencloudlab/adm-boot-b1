package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.ProductDao;

@SpringBootApplication
public class BootDatajpaEcartApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootDatajpaEcartApplication.class, args);
		ProductDao prodDao = ac.getBean(ProductDao.class);
		
		// find all products
		//prodDao.findAll().forEach(System.out::println);
		
		// find all products by product name
		//prodDao.findByProductTitleLike("%Samsung%").forEach(System.out::println);
		
		// find all products whose price is greater than ?
		//prodDao.findByProductPriceGreaterThanEqual(12000).forEach(System.out::println);
		
		// find all products whose price is less than than ?
		//prodDao.findByProductPriceLessThanEqual(12000).forEach(System.out::println);
		
		//find all products with specified price range?
		//prodDao.findByProductPriceBetween(5000, 60000).forEach(System.out::println);
		
		// list all products for a specific brand name
		//prodDao.findByBrand_BrandTitleLike("%Samsung%").forEach(System.out::println);
		
		//list all products of a specified category name
		//prodDao.findByCategory_CatTitle("Mobiles").forEach(System.out::println);

		//list all products matching with a brand name and price greater than?
		//prodDao.findByBrand_BrandTitleLikeAndProductPriceGreaterThanEqual("Samsung", 10000).forEach(System.out::println);
		
		
		prodDao.filterProducts("Apple").forEach(System.out::println);
		
	}

}
