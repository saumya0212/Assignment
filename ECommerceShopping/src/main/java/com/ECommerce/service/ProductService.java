package com.ECommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.product.Product;
import com.ECommerce.productRepository.ProductRepository;

import jakarta.transaction.Transactional;

@Service

@Transactional

public class ProductService {

@Autowired

public ProductRepository productRepository;



public Long deleteById (long id) { 
Product product=productRepository.findById(id);
productRepository.delete (product);

return product.getId();
}
}