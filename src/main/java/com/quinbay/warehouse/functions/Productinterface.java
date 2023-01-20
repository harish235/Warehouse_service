package com.quinbay.warehouse.functions;

import com.quinbay.warehouse.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface Productinterface {

    List<Product> getAllProducts();

    ResponseEntity<Product> getProduct(int p_id);

    String createProduct(Product p);

    ResponseEntity<HttpStatus> deleteProduct(int p_id);

//    ResponseEntity<Product> getProductByName(String name);

    ResponseEntity<Product> getProductByName(String name);
}
