package com.durgesh.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.durgesh.entity.Coupon;

@FeignClient("COUPON-SERVICE")
public interface CouponRestClient {
	
	@GetMapping("/Coupon/{code}")
	Coupon getCoupon(@PathVariable("code") String code);

}
