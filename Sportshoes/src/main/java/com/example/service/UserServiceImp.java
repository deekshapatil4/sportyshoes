package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
@Service
public class UserServiceImp implements UserService{
	@Autowired
UserRepository urepository;
	@Override
	public List<User> getAllUsers() {
		List<User> list=urepository.findAll();
		return list;
	}

}
