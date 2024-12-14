package com.demo_cart.demo.service;

import com.demo_cart.demo.model.Product;
import com.demo_cart.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductsService {
   @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Laptop",100000)));
    public List<Product> getProduct(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product(0,"None",0));
    }
    public void addProduct(Product prod){
        repo.save(prod);
    }
    public void updateProduct(Product prod){
        repo.save(prod);
    }
    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }

}
