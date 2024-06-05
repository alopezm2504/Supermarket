package com.unialex.helloWorld.utils;

import com.unialex.products.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {

    public static List<Product> PRODUCTS = new ArrayList<>();
    /*private static List<Product> createProducts(){
        Product product1=new Product("frijoles",3,12000, List.of("Diana","CargaManto","Verde"));
        Product product2=new Product("panela",3,12000, List.of("Supia","Amarga","Trébol"));
        PRODUCTS.add(product2);
        PRODUCTS.add(product1);
        return PRODUCTS;
    }
    public static Product findProductByName(String name){
        for (Product product:createProducts() ) {
            if(product.name.equals(name)){
                return product;

            }

        }
        return null;
    }

    public static Product createProduct(Product product) {
        createProducts();
        System.out.println(PRODUCTS);
        PRODUCTS.add(product);
        System.out.println(PRODUCTS);
        return product;
    }*/
}
