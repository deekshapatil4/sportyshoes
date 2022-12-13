package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String Name;
	private String password;
	public int getId() {
		return Id;
	}
	public void setUserId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setUserName(String Name) {
		this.Name = Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", password=" + password + "]";
	}
	
	
}
