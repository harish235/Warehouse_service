package com.quinbay.warehouse.service;

import com.quinbay.warehouse.functions.Warehouseinterface;
import com.quinbay.warehouse.repository.Warehouserepository;
import com.quinbay.warehouse.model.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Warehouseservice implements Warehouseinterface {

    @Autowired
    Warehouserepository warehouserepository;

    @Override
    public List<Warehouse> getAllWarehouses(){
        return warehouserepository.findAll();
    }

    @Override
    public ResponseEntity<Warehouse> getwarehouse(int w_id){
        Optional<Warehouse> warehouseData = warehouserepository.findById(w_id);
        if(warehouseData.isPresent()){
            return new ResponseEntity<>(warehouseData.get(), HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public String createWarehouse(Warehouse w){
        try{
            Warehouse _w = warehouserepository.save(w);
//            return new ResponseEntity<>(_w, HttpStatus.CREATED);
            return "Warehouse created successfully!!!";
        } catch(Exception e){
//            return new ResponseEntity<>(w , HttpStatus.OK);
            return "Warehouse cannot be created!!!";
        }
    }

    @Override
    public ResponseEntity<HttpStatus> deleteWarehouse(int w_id){
        try{
            warehouserepository.deleteById(w_id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
