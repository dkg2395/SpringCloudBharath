package com.durgesh.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Coupon {
	
	private Long id;
	private String code;
	private BigDecimal discount;
	
	private String expDate;

}
