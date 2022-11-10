package com.durgesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.entity.Coupon;
import com.durgesh.repo.CouponRepository;

@RestController
public class CouponController {
	
	@Autowired
	CouponRepository couponRepository;
	
	@PostMapping("/SaveCoupon")
	public Coupon saveCoupon(@RequestBody Coupon   coupon ) {
		
		return couponRepository.save(coupon);
		
		
	}
	
	@GetMapping("/Coupon/{code}")
	public Coupon getCoupon( @PathVariable String   code ) {
		
		return couponRepository.findByCode(code);
		
		
	}

}
