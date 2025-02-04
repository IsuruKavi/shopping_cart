package com.demo_cart.demo.controller;

import com.demo_cart.demo.model.Product;
import com.demo_cart.demo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
 @Autowired
  ProductsService service;
 @GetMapping("/products")
  public List<Product> getProducts(){

      return service.getProduct();
  }
 @GetMapping("/products/{prodId}")
  public Product getProductById(@PathVariable int prodId){

         return service.getProductById(prodId);
  }
@PostMapping("/products")
 public void addProduct(@RequestBody Product prod){
 System.out.println(prod);
  service.addProduct(prod);
}

}
