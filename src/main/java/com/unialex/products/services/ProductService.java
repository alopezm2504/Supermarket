package com.unialex.products.services;

import com.unialex.products.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findProductAll();
    Optional<Product> findById(int id);
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Product product);
}
