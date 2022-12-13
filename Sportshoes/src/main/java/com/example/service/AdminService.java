package com.example.service;

import java.util.List;

import com.example.entity.Admin;

public interface AdminService {
public List<Admin> adminList();

public Admin updatepassword(int id);

public void Addpassword(Admin admin);
}
