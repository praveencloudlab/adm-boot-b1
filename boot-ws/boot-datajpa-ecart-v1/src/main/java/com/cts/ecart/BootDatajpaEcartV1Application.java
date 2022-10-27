package com.cts.ecart;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.dao.BrandDao;
import com.cts.ecart.dao.CategoryDao;
import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.dao.UserDao;
import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.PriceInfo;
import com.cts.ecart.entity.Product;
import com.cts.ecart.entity.StockInfo;
import com.cts.ecart.entity.UserInfo;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class BootDatajpaEcartV1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(BootDatajpaEcartV1Application.class, args);

		ProductDao prodDao = ac.getBean(ProductDao.class);
		BrandDao brandDao = ac.getBean(BrandDao.class);
		CategoryDao categoryDao = ac.getBean(CategoryDao.class);
		UserDao userDao = ac.getBean(UserDao.class);
		
		//UserInfo u1=new UserInfo(null, null, null, null, null, null, 0, null);
		
		
		Brand b1=new Brand("Dell");
		Brand b2=new Brand("Sony");
		Brand b3=new Brand("Apple");
		Brand b4=new Brand("Hp");
		Brand b5=new Brand("Lenovo");
		Brand b6=new Brand("One Plus");
		Brand b7=new Brand("Samsung");
		Brand b8=new Brand("Real Me");
		Brand b9=new Brand("Mi");
		Brand b10=new Brand("WD");
		//brandDao.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10));
		
		
		Category c1=new Category("Mobiles");
		Category c2=new Category("Mens Wear");
		Category c3=new Category("Women Ware");
		Category c4=new Category("Home Appliences");
		Category c5=new Category("Kitchen");
		Category c6=new Category("Televisions");
		Category c7=new Category("Laptops");
		//categoryDao.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7));
		
	
		Product p1=new Product("Dell Laptop", "I5 Gen12 16GB RAM 2 TB SSD", "Dell,I5", 0, b1, c7, new PriceInfo(45000), new StockInfo(6));
		Product p2=new Product("Apple Macbook Pro", "Apple M2 chip 16 GB 2 TB SSD", "Apple,Mac Book,Mac Book Pro,M2", 0, b3, c7, new PriceInfo(235000), new StockInfo(10));
		Product p3=new Product("Iphone14", "256 GB Purple", "Phone,Iphone,Iphone14", 0, b3, c1, new PriceInfo(97000), new StockInfo(13));
		Product p4=new Product("Iphone 14 Pro", "512 GB Deep Blue", "Phone,Iphone,Iphone14 Pro", 0, b1, c7, new PriceInfo(135000), new StockInfo(2));
		Product p5=new Product("Iphone 14 Pro", "256 GB Green", "Phone,Iphone,Iphone14 Pro", 0, b7, c1, new PriceInfo(125000), new StockInfo(30));
		Product p6=new Product("Samsung S22", "512 Black", "Samsung,S22", 0, b1, c7, new PriceInfo(122000), new StockInfo(6));
		Product p7=new Product("Samsung S22", "256 Blue", "Samsung,S22", 0, b1, c7, new PriceInfo(98000), new StockInfo(6));
		Product p8=new Product("Samsung S22", "512 Red", "Samsung,S22", 0, b1, c7, new PriceInfo(125000), new StockInfo(6));
		Product p9=new Product("HP Laptop", "I9 Gen12 32GB RAM 2 TB SSD", "HP,Laptop", 0, b4, c7, new PriceInfo(267000), new StockInfo(3));
		Product p10=new Product("Lenovo Laptop", "I5 Gen12 16GB RAM 2 TB SSD", "Lenovo,I5", 0, b5, c7, new PriceInfo(55000), new StockInfo(8));

		//prodDao.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
		
		
		
		
		
		
		
	}

}
