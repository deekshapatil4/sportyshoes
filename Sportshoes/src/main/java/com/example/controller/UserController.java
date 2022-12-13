package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.User;
import com.example.service.UserServiceImp;

@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
UserServiceImp userservice;
@GetMapping("/UsersList")
public String getAllUsers(Model model) {
	List<User> list=userservice.getAllUsers();
	model.addAttribute("user",list);
	return "UsersList";
}
}
