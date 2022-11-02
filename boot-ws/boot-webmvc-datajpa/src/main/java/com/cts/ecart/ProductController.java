package com.cts.ecart;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.ecart.entity.Product;
import com.cts.ecart.service.ProductService;

@Controller
@SessionAttributes(names = {"s1"})
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//dash-board page
	@RequestMapping(value = "/")
	public String welcome() {
		return "index";
	}
	
	// load productForm
	
	@RequestMapping(value = "/productForm")
	public String loadProductForm(Model model) {
		
		model.addAttribute("brands", productService.findAllBrands());
		model.addAttribute("categories", productService.findAllCategories());
		
		
		return "product-form";
	}
	
	// list all products
	@RequestMapping(value = "/listAll")
	private String listAllProducts(Model model) {
		
		List<Product> products = productService.findAll();
		System.out.println(products);
		
		model.addAttribute("allProducts", products);
		
		return "products";
	}
	
	@RequestMapping(value = "/saveProduct",method = RequestMethod.POST)
	public String saveProduct(@RequestParam("productTitle") String productTitle,@RequestParam("productPrice") double productPrice,@RequestParam("description") String description) {
		System.out.println(">>>> Name: "+productTitle);
		System.out.println(">>>> Price: "+productPrice);
		System.out.println(">>>> Description: "+description);
		return "index";
	}
	
	@RequestMapping(value = "/saveProductV1",method = RequestMethod.POST)
	public String saveproductV1(@ModelAttribute Product product) {
		System.out.println(product);
		productService.saveProduct(product);
		return "redirect:/listAll";
	}
	@RequestMapping(value = "/search")
	public String findById(@RequestParam("id")int id,Model model) {
		
		Product product = productService.findById(id);
		if(product!=null) {
			model.addAttribute("product", product);
			model.addAttribute("s1", "session data");
		}
		
		return "product";
	}
	
	
	
	
	
	
	
	

}
