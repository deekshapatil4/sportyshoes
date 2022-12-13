package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Admin;
import com.example.service.AdminServiceImp;

@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
	AdminServiceImp aservice;
   @GetMapping("/adminpage")
   public String getAdminDetails(Model model) {
	   List<Admin> list=aservice.adminList();
	   model.addAttribute("lists",list);
	   return "Adminpage";
   }
   @GetMapping("/changepassword/{id}")
   public String updatepassword(@PathVariable(value="id")int id,Model model) {
	   Admin admin=aservice.updatepassword(id);
	   model.addAttribute("password",admin);
	   return "updatepassword";
   }
   @PostMapping("/passwordchanged")
   public String addpassword(@ModelAttribute("password")Admin admin) {
	   aservice.Addpassword(admin);
	   return "Passwordchange";
   } 
}
