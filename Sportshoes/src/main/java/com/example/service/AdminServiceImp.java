package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.repository.AdminRepository;
@Service
public class AdminServiceImp implements AdminService {
@Autowired
	AdminRepository adminrepository;
	
	public List<Admin> adminList() {
		List<Admin> list=adminrepository.findAll();
		return list;
	}

	
	public Admin updatepassword(int id) {
		Optional<Admin> optional=adminrepository.findById(id);
		Admin admin=null;
		if(optional.isPresent()) {
			admin=optional.get();
		}
		else {
			
				throw new ArithmeticException("Invalid Id  ");
			}
			
		return admin;
	}

	@Override
	public void Addpassword(Admin admin) {
		adminrepository.save(admin);
		
	}


	
	}


