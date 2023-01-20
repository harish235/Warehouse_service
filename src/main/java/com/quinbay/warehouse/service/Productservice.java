package com.quinbay.warehouse.service;


import com.quinbay.warehouse.functions.Productinterface;
import com.quinbay.warehouse.model.Product;
import com.quinbay.warehouse.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Productservice implements Productinterface {

    @Autowired
    Productrepository pr;


    @Override
    public List<Product> getAllProducts(){
        return pr.findAll();
    }

    @Override
    public ResponseEntity<Product> getProduct(int p_id){
        Optional<Product> productData = pr.findById(p_id);
        if(productData.isPresent()){
            return new ResponseEntity<>(productData.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @Override
//    public ResponseEntity<Product> getProductByName(String name){
//        Optional<Product> productData = pr.findByproduct_name(name);
//        if(productData.isPresent()){
//            return new ResponseEntity<>(productData.get(), HttpStatus.OK);
//        } else{
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @Override
    public String createProduct(Product p){
        try{
            Product _p = pr.save(p);
//            return new ResponseEntity<>(_w, HttpStatus.CREATED);
            return "Product created successfully!!!";
        } catch(Exception e){
//            return new ResponseEntity<>(w , HttpStatus.OK);
            return "Product cannot be created!!!";
        }
    }

    @Override
    public ResponseEntity<HttpStatus> deleteProduct(int p_id){
        try{
            pr.deleteById(p_id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Product> getProductByName(String name){
        Optional<Product> productData = pr.findByName(name);
        if(productData.isPresent()){
            return new ResponseEntity<>(productData.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
