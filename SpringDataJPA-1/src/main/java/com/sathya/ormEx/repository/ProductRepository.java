package com.sathya.ormEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.ormEx.entity.Product;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
