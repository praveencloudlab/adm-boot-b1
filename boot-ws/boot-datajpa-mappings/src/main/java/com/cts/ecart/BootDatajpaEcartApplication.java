package com.cts.ecart;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.ecart.dao.DepartmentDao;
import com.cts.ecart.entity.Department;
import com.cts.ecart.entity.Employee;

@SpringBootApplication
public class BootDatajpaEcartApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(BootDatajpaEcartApplication.class, args);

		Department d1 = new Department("IT");
		Department d2 = new Department("HR");
		Department d3 = new Department("Accounts");

		Employee e1 = new Employee("Praveen", 83463);
		Employee e2 = new Employee("James", 4857445);
		Employee e3 = new Employee("Rose", 3753744);
		Employee e4 = new Employee("David", 236344);
		Employee e5 = new Employee("Bucky", 9749344);
		Employee e6 = new Employee("Kavya", 364444);
		Employee e7 = new Employee("Rajeev", 84755);
		Employee e8 = new Employee("Doe", 3475374);
		Employee e9 = new Employee("Maria", 937493);
		Employee e10 = new Employee("Ali", 869464646);
		
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
		
		d1.setEmployees(emps);
		
		
		DepartmentDao deptDao = ac.getBean(DepartmentDao.class);
		
		deptDao.save(d1);
		
		
		
		
		
		
		
		
		
		

	}

}
