package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
