package com.unialex.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.unialex.products")
public class ProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

}
