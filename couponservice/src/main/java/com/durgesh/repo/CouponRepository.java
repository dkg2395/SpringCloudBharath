package com.durgesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long>{

	Coupon findByCode(String code);

}
