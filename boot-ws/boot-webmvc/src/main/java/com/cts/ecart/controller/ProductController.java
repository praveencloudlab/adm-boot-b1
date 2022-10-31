package com.cts.ecart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.ecart.model.Product;

/*
 * String return can be two types
 * 	type 1 : view name
 *  type 2 : redirections
 * 
 * 
 */
@Controller
public class ProductController {
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>> f1 method of ProductController");
	}
	
	@RequestMapping(value = "/d1")
	public String f2() {
		System.out.println(">>> f2 method of ProductController");
		return "products";
	}
	
	
	@RequestMapping(value = "/d2")
	public String f3() {
		System.out.println(">>> f3 method of ProductController");
		return "redirect:/d1";
	}
	
	@RequestMapping(value = "/d3")
	public String f4(Model model) {
		System.out.println(">>> f4 method of ProductController");

		Product p1=new Product(10, "Pen", 87.54, "Ball Pen");

		model.addAttribute("user", "Praveen");
		model.addAttribute("city", "Hyderabad");
		model.addAttribute("prod", p1);
		
		
		
		return "display";
	}

}
