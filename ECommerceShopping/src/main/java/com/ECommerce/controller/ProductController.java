package com.ECommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ECommerce.product.Product;
import com.ECommerce.productRepository.ProductRepository;
import com.ECommerce.service.ProductService;


@RestController
@RequestMapping("/api/products/")
public class ProductController {
@Autowired
public ProductRepository productRepository;

@Autowired
public ProductService productService;
    //get All Data
@GetMapping("/getAllData")
public List<Product> getAllProducts(){
return productRepository.findAll();
}
//Get Data by Id
@GetMapping("getProductById/{id}")
public ResponseEntity<Product> getProductById(@PathVariable long id) {
Product product=productRepository.findById(id);
return ResponseEntity.ok(product);
}
//create data
@PostMapping("/createProduct")
public Product createProduct(@RequestBody Product product) {
return productRepository.save(product);
}
// update data
@PutMapping("updateProduct/{id}")
public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product productDetails) {
Product product=productRepository.findById(id);
product.setName(productDetails.getName());
product.setDescription(productDetails.getDescription());
product.setPrice(productDetails.getPrice());
product.setQuantity(productDetails.getQuantity());
Product updateproduct=productRepository.save(product);
return ResponseEntity.ok(updateproduct);
}

//Delete data
@DeleteMapping("/deleteProduct")
public ResponseEntity<Long > deleteProductById(@RequestParam("id") long id){
return new ResponseEntity<>(productService.deleteById(id),HttpStatus.OK);


}
}