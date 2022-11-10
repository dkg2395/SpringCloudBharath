package com.durgesh.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.durgesh.entity.Coupon;

@FeignClient("COUPON-SERVICE")
//@FeignClient("ZUULAPIGATEWAY")
public interface CouponRestClient {
	
	@GetMapping("/couponapim/Coupon/{code}")
	Coupon getCoupon(@PathVariable("code") String code);

}
