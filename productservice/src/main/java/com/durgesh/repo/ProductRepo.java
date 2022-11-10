package com.durgesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durgesh.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
