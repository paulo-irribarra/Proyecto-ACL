package com.example.back.application;

import com.example.back.domain.model.Product;
import com.example.back.domain.port.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product AddProduct(Product product) {
        return productRepository.saveProduct(product);
    }
}
