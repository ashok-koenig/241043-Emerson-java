package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @Test
    void testSaveProduct(){
        Product mockProduct = new Product("iPhone", 1234);
        Mockito.when(productRepository.save(mockProduct)).thenReturn(mockProduct);

        Product result = productService.saveProduct(mockProduct);

        Assertions.assertEquals(mockProduct.getName(), result.getName());
    }
}
