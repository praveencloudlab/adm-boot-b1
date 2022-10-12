package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.config.CollectionConfig;
import com.cts.ecart.service.PersonServiceImpl;

@SpringBootApplication
public class BootAutowireV2Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(BootAutowireV2Application.class, args);
	
		DBUtils dbUtils = ac.getBean(DBUtils.class);
		
		CollectionConfig config = ac.getBean(CollectionConfig.class);
		
		//config.personNamesList().add("Praveen");
		
		//config.personNamesList().set(1, "James");
		
		PersonServiceImpl ps = ac.getBean(PersonServiceImpl.class);
		
		ps.getPersons().forEach(System.out::println);
		System.out.println("--------------------------");
		
	
		dbUtils.printNameList();
		System.out.println("-------------------------");
		dbUtils.printCityList();
		
		
		
		
		
		
		
	}

}
