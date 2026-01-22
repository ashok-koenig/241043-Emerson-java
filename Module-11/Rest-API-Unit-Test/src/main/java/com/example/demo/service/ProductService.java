package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(UUID id){
        return productRepository.findById(id).orElseThrow();
    }

    public String deleteProduct(UUID id){
        productRepository.deleteById(id);
        return "Product deleted";
    }

    public List<Product> getProductByName(String name){
        return productRepository.findByName(name);
    }

    public List<Product> getProductsByNameAndPrice(String name, double price){
        return productRepository.findByNameAndPrice(name, price);
    }
}
