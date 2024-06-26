package com.unialex.products.mappers;

import com.unialex.products.models.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setQuantity(rs.getInt("quantity"));
        product.setPrice(rs.getInt("price"));
        return product;
    }
}
