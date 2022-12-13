package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	ProductRepository repo;
	@Override
	public List<Product> getAllProducts() {

		return repo.findAll();
	}

	public void addProducts(Product product) {

		repo.save(product);
		
	}

	public Product updateProduct(int id) {
		Optional<Product> optional= repo.findById(id);
		Product product=null;
		if(optional.isPresent()) {
			product=optional.get();
		}
		
			else {
				throw new ArithmeticException("id is not present ");
			}
		
		return product;
	}	
	
@Override
	public void deleteProduct(int id) {
		repo.deleteById(id);
		
	}

}
