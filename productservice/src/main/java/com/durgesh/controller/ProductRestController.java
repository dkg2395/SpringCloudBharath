package com.durgesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.client.CouponRestClient;
import com.durgesh.entity.Coupon;
import com.durgesh.entity.Product;
import com.durgesh.repo.ProductRepo;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepo productRepo;
	@Autowired
	CouponRestClient couponRestClient;
	
	@PostMapping("saveProduct")
	public Product create(@RequestBody Product  product ) {
		
		Coupon coupon = couponRestClient.getCoupon( product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
	
		
		return productRepo.save(product);
	}

}
