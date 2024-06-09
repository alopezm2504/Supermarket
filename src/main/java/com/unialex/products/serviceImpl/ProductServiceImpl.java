package com.unialex.products.serviceImpl;

import com.unialex.products.mappers.ProductRowMapper;
import com.unialex.products.models.Product;
import com.unialex.products.repositories.ProductRepository;
import com.unialex.products.services.ProductService;
import com.unialex.products.utils.queries.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public Product createProduct(Product product){return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
         productRepository.delete(product);
    }

    @Override
    public String getMoreExpensive() {
        return jdbcTemplate.queryForObject(Queries.GET_MORE_EXPENSIVE, String.class);
    }

    @Override
    public List<Product> getMoreExpenciveThan5000() {
        return jdbcTemplate.query(Queries.GET_MORE_EXPENSIVE_THAN_5000, new ProductRowMapper());
    }

    @Override
    public List<Product> findProductAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }



}
