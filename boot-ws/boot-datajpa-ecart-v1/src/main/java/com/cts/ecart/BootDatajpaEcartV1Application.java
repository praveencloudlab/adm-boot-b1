package com.cts.ecart;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.dao.BrandDao;
import com.cts.ecart.dao.CartDao;
import com.cts.ecart.dao.CategoryDao;
import com.cts.ecart.dao.OrderDao;
import com.cts.ecart.dao.ProductDao;
import com.cts.ecart.dao.UserDao;
import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Cart;
import com.cts.ecart.entity.Category;
import com.cts.ecart.entity.Order;
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
		CartDao cartDao = ac.getBean(CartDao.class);
		OrderDao orderDao = ac.getBean(OrderDao.class);
		
		UserInfo u1=new UserInfo("user1", "user1", "Praveen", "Reddy", LocalDate.of(1983, 8, 21), "praveen@abc.com", 8787878787L, "Hyderabad");
		UserInfo u2=new UserInfo("user2", "user2", "David", "Rodson", LocalDate.of(1981, 2, 22), "david@abc.com", 9749876545L, "Chennai");
		UserInfo u3=new UserInfo("user3", "user3", "Rose", "Wine", LocalDate.of(1980, 2, 12), "rose@abc.com", 9854643234L, "Pune");
		UserInfo u4=new UserInfo("user4", "user4", "Bucky", "Wall", LocalDate.of(1991, 9, 18), "bucky@abc.com", 7898098765L, "Kolkatha");
		UserInfo u5=new UserInfo("user5", "user5", "Prashath", "Kumar", LocalDate.of(1978, 5, 29), "prashanth@abc.com", 6578989987L, "Delhi");

		
		//userDao.saveAll(Arrays.asList(u1,u2,u3,u4,u5));
		
		
		Cart ca1=new Cart(1, 1, 3);
		Cart ca2=new Cart(1, 6, 1);
		Cart ca3=new Cart(2, 10, 10);
		Cart ca4=new Cart(3, 14, 6);
		Cart ca5=new Cart(4, 27, 2);
		Cart ca6=new Cart(5, 30, 1);
		//cartDao.saveAll(Arrays.asList(ca1,ca2,ca3,ca4,ca5,ca6));
		
		//prodDao.findById(1).orElse(null);
		
		//prodDao.getById(12);
		//prodDao.findById(12).orElse(null);
		
		
		//Order o1=new Order(3, LocalDateTime.now(),prodDao.findById(1).orElse(null).getPriceInfo().getPrice() * 3 , "202210280001", "success", 1, 1);
		//Order o2=new Order(2, LocalDateTime.now(),prodDao.findById(6).orElse(null).getPriceInfo().getPrice() * 2 , "202210280002", "success", 6, 1);
		//Order o3=new Order(1, LocalDateTime.now(),prodDao.findById(10).orElse(null).getPriceInfo().getPrice() * 1 , "202210280003", "success", 10, 2);
		//Order o4=new Order(5, LocalDateTime.now(),prodDao.findById(14).orElse(null).getPriceInfo().getPrice() * 5 , "202210280004", "success", 14, 3);
		//Order o5=new Order(4, LocalDateTime.now(),prodDao.findById(17).orElse(null).getPriceInfo().getPrice() * 5 , "202210280005", "success", 17, 4);

		//orderDao.saveAll(Arrays.asList(o1,o2,o3,o4,o5));
		
		
		
		Brand b1=new Brand("Dell");
		Brand b2=new Brand("Sony");
		Brand b3=new Brand("Apple");
		Brand b4=new Brand("Hp");
		Brand b5=new Brand("Lenovo");
		Brand b6=new Brand("One Plus");
		Brand b7=new Brand("Samsung");
		Brand b8=new Brand("Real Me");
		Brand b9=new Brand("Mi");
		Brand b10=new Brand("Vivo");
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
		Product p11=new Product("Sony Bravio", "65 inch OLED", "Sony,Bravio,OLED,65 inch", 0, b2, c6, new PriceInfo(245000), new StockInfo(14));
		Product p12=new Product("One Plus 10R", "512 GB Blue", "One Plus,10R", 0, b6, c1, new PriceInfo(65000), new StockInfo(20));
		Product p13=new Product("Real Me GT Pro", "256 GB Green Glass", "Real Me,GT,GT Pro", 0, b8, c1, new PriceInfo(56000), new StockInfo(16));
		Product p14=new Product("MI OLED TV", "65 inch OLED", "MI,MI OLED,OLED,65 inch", 0, b9, c6, new PriceInfo(67000), new StockInfo(12));
		Product p15=new Product("Vivo 5.7 OLED ", "256 GB Blue", "Vivo", 0, b10, c1, new PriceInfo(34000), new StockInfo(13));



		//prodDao.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));
		
		
		
		
		
		
		
	}

}
