package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class BootCoreV1Application {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ac= SpringApplication.run(BootCoreV1Application.class, args);
		
		 ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);
		//ProductServiceImpl ps2 = ac.getBean(ProductServiceImpl.class);
		 ps1.f3();
		 //ps1.save();
		//ps2.save();
		
		//ac.close();
		 
		
		
		
		
	}
	
	
	

}
