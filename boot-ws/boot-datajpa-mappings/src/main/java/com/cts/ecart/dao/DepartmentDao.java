package com.cts.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{
	
	

}
