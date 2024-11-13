// infraestructura/adapters/ProductRepositoryAdapter.java
package com.example.infraestructura.adapters;

import com.example.back.domain.model.Product;
import com.example.back.domain.port.ProductRepository;
import com.example.back.infrastructure.repository.ProductJpaRepository;
import com.example.back.infrastructure.repository.ProductJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryAdapter implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;

    public ProductRepositoryAdapter(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        Product producto = new Product(nul);
        ProductEntity savedEntity = productJpaRepository.save(entity);
        return new Product(savedEntity.getId(), savedEntity.getNombre(), savedEntity.getMarca(), savedEntity.getDescripcion());
    }
}
