package com.unialex.products.controllers;

import com.unialex.products.models.Product;
import com.unialex.products.serviceImpl.ProductServiceImpl;
import com.unialex.products.utils.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping(value = "product/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product productKept = productServiceImpl.createProduct(product);
        return new ResponseEntity<>(productKept, HttpStatusCode.valueOf(201));
    }

    @GetMapping(value = "products/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productServiceImpl.findProductAll(), HttpStatusCode.valueOf(200));
    }

    @GetMapping(value = "products/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") int id) {
        return new ResponseEntity<>(productServiceImpl.findById(id), HttpStatusCode.valueOf(200));
    }
    @PutMapping("product/update/{id}")
    public ResponseEntity<Object> actualizarProducto(@PathVariable int id, @RequestBody Product detallesProducto) {
        Product producto = productServiceImpl.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado con id: " + id));

        producto.setName(detallesProducto.getName());
        producto.setQuantity(detallesProducto.getQuantity());
        producto.setPrice(detallesProducto.getPrice());

        Product productoActualizado = productServiceImpl.updateProduct(producto);
        return ResponseEntity.ok(productoActualizado);
    }
    @DeleteMapping("product/delete/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable int id) {
        Product product = productServiceImpl.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado con id: " + id));
        System.out.println(product);

        productServiceImpl.deleteProduct(product);
        return ResponseEntity.noContent().build();
    }
}
