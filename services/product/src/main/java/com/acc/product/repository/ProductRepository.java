package com.acc.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acc.product.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  List<Product> findAllByIdInOrderById(List<Integer> ids);
}