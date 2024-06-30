package com.practice._SD35.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice._SD35.entity.Product;
import com.practice._SD35.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	public void saveProduct(Product product) {
		product.setBarCode(UUID.randomUUID().toString());
		productRepo.save(product);
		
	}

}
