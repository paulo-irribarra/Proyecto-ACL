package com.example.back.adpters.outbound;

import com.example.back.domain.model.Product;
import com.example.back.domain.port.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryAdapter  implements ProductRepository {

    // Implementa la lógica para guardar el producto (utilizando JPA, JDBC, etc.)
    @Override
    public Product saveProduct(Product product) {
        // Código para guardar el producto en la base de datos
        return product;
    }
}
