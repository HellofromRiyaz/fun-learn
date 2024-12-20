package com.rj.helloWeb.repository;

import com.rj.helloWeb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

    Product findByProductName(String productName);
}
