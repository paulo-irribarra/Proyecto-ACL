package com.example.back.domain.port;

import com.example.back.domain.model.Product;

public interface ProductRepository {

    Product saveProduct(Product product);
}
