package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cts.ecart.service.TransferServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BootAopApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootAopApplication.class, args);
		
		TransferServiceImpl ts = ac.getBean(TransferServiceImpl.class);
		
		String msg = ts.fundsTransfer();
		ts.rewardTransfer();
		
		System.out.println("main :: "+msg);
		
		
		
		/*
		
		//Employee emp=new Employee();
		Employee emp = ac.getBean(Employee.class);
		Product prod = ac.getBean(Product.class);
		
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(8686);
		
		
		prod.setProductId(100);
		prod.setProductName("Pen");
		prod.setPrice(97997);
		*/
		
		
	}

}
