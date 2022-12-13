package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public  int id;
	
	
	@Column(name="category")
	 private String category;
	
	@Column(name="company")
  private String company;
	
	@Column(name="price")
  private int price;
	
	@Column(name="size")
private int size;
	
	
	


	public Product() {

	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		this.company = company;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getSize() {
		return size;
	}




	public void setSize(int size) {
		this.size = size;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category+ ", company=" + company +  ", price=" + price
				 +  " , size=" + size +  "]";
	}
	
}
