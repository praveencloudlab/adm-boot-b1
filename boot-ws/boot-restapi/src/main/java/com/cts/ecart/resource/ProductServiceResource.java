package com.cts.ecart.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;

@RestController
public class ProductServiceResource {
	
	
	
	@GetMapping("/find")
	public Product getProduct() {
		Product p1=new Product(10, "Laptop", 854685);
		return p1;
	}
	
	@GetMapping("/findAll")
	public List<Product> findAll() {
		return Arrays.asList(new Product(11, "Book", 3874),new Product(12, "pen", 487));
	}
	
	@GetMapping
	public String f1(@PathVariable String msg) {
		return "GET:: Good Evening :: "+msg;
	}

	@PostMapping
	public String f2() {
		return "POST:: Good Evening!";
	}
	
	@PutMapping
	public String f3() {
		return "PUT:: Good Evening!";
	}
	
	@PatchMapping
	public String f4() {
		return "PATCH:: Good Evening!";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE:: Good Evening!";
	}
}
