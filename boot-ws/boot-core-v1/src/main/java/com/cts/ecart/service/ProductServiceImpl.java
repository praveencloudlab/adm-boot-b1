package com.cts.ecart.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
@Lazy //default value is true
public class ProductServiceImpl {
	
	/*
	 * 
	 *  bean-scopes
	 *  ---------------
	 *  1.singleton : default
	 *  2.prototype
	 *  3.request
	 *  4.application
	 *  5.session
	 *  6.globalSession
	 *  7.websocket
	 * 
	 * 
	 * 
	 *   lazy loading and eager loading of beans
	 *   -------------------------------------------
	 *  
	 *   eager loading: (default)
	 *   ----------------------------
	 *   -> even not called by getBean method, spring boot still creates objects
	 *   
	 *   lazy loading
	 *   --------------
	 *   -> spring boot creates objects only when you call getBean method on your won
	 * 
	 * 
	 * 
	 *  spring-boot life cycle methods
	 *  ---------------------------------
	 *  -> constructor
	 *  -> post construct
	 *  -> bean
	 *  -> pre-destroy : works only with singleton scope. 
	 *  
	 *  
	 *   bean
	 *   --------
	 *   -> if bean scope is singleton, then single copy of bean object is used while invoking 
	 *      multiple times
	 *   -> if bean scope is prototype, then each invocation of bean, spring boot creates 
	 *      separate objects. 
	 *   -> bean internally calls constructor followed by post construct life cycle methods
	 *   -> bean doesn't work when scope is defined as 'lazy' 
	 *  
	 * 
	 * 
	 * 
	 */

	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl object created on "+this.hashCode());
	}
	
	@Bean
	public void f3() {
		System.out.println(">>> ProductServiceImpl :: bean scope-1 by "+this.hashCode());
	}
	
	
	@PreDestroy
	public void f6() {
		System.out.println(">>> ProductServiceImpl:: pre-destroy");
	}
	
	
	/*
	@Bean
	public void f4() {
		System.out.println(">>> ProductServiceImpl :: bean scope-2 by "+this.hashCode());
	}
	
	@Bean
	public void f5() {
		System.out.println(">>> ProductServiceImpl :: bean scope-3 by "+this.hashCode());
	}
	*/
	
	
	
	@PostConstruct
	public void f1() {
		System.out.println(">>> ProductServiceImpl:: postconstruct-1 by "+this.hashCode());
	}
	@PostConstruct
	public void f2() {
		System.out.println(">>> ProductServiceImpl:: postconstruct-2 by "+this.hashCode());
	}
	
	

	public void save() {
		System.out.println("ProductSericeImpl :: save method by "+this.hashCode());
	}

	public void update() {
		System.out.println("ProductSericeImpl :: update method");
	}

}
