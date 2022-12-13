package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Product;
import com.example.service.ProductServiceImp;
@Controller
@RequestMapping("/product")
public class ProductController {
		@Autowired
		ProductServiceImp serviceImp;
		@GetMapping("/")
		public String homePage(Model model) {
			
			
			model.addAttribute("Products", serviceImp.getAllProducts());
			
			
			return "index";
		}

		@GetMapping("/newProductform")
		public String loadformpage(Model model) {
			Product products=new Product();
			model.addAttribute("product", products);
			
			return "addnewProduct";
		}

		
	   @PostMapping("/productsaved")
		public String addnewproduct(@ModelAttribute("product") Product product) {
			serviceImp.addProducts(product);
			
			
			return "redirect:/product/";
			
		}
		
		@GetMapping("/updateproduct/{id}")
		public String updateproduct(@PathVariable(value="id") int id,Model model) {
			
			Product product= serviceImp.updateProduct(id);
			model.addAttribute("product", product);
			return "updateProduct";
			
		}
		
		@GetMapping("/deleteproduct/{id}")
		public String deleteProduct(@PathVariable(value = "id") int id) {
			serviceImp.deleteProduct(id);
			
			return "redirect:/product/";
		}
		
}
