package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {

    List<Product> findByName(String name);
    List<Product> findByNameAndPrice(String name, double price);
}
