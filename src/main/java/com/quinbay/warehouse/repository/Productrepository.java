package com.quinbay.warehouse.repository;


import com.quinbay.warehouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Productrepository extends JpaRepository<Product, Integer> {

    //Optional<Product> findByproduct_name(String product_name);
    Optional<Product> findByName(String name);
}
