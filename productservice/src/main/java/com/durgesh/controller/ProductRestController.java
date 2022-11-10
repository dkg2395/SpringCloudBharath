package com.durgesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.entity.Product;
import com.durgesh.repo.ProductRepo;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepo productRepo;
	
	@PostMapping("saveProduct")
	public Product create(@RequestBody Product  product ) {
		
		return productRepo.save(product);
	}

}
