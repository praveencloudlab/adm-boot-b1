package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication

 // auto discovery
//@ComponentScan("com")
public class BootCoreApplication {
	
	public static void main(String[] args) {
	
		ApplicationContext ac= SpringApplication.run(BootCoreApplication.class,args);
		//C1 c1 = (C1) ac.getBean("c1Obj");
		//C1 c1 = ac.getBean("c1Obj",C1.class);
		C1 c1 = ac.getBean(C1.class);
		 c1.f1();
		
	}

}
