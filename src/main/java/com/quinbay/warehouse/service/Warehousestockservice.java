package com.quinbay.warehouse.service;

import com.quinbay.warehouse.functions.Warehousestockinterface;
import com.quinbay.warehouse.model.Warehouse;
import com.quinbay.warehouse.model.Warehousestock;
import com.quinbay.warehouse.repository.Warehousestockrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Warehousestockservice implements Warehousestockinterface {
    @Autowired
    Warehousestockrepository wsr;

    @Override
    public List<Warehousestock> getAllWarehouseStock(){
        return wsr.findAll();
    }

    @Override
    public String updateWarehouseStock(Warehousestock w){
        Warehousestock newStock = wsr.findByWarehouseidAndProductid(w.getWarehouse_id(), w.getProduct_id());

        if(newStock != null) {
            newStock.setProduct_price(w.getProduct_price());
            newStock.setStock(w.getStock());
            wsr.save(newStock);
        }
        else{
            newStock = new Warehousestock();
            newStock.setWarehouse_id(w.getWarehouse_id());
            newStock.setProduct_id(w.getProduct_id());
            newStock.setProduct_price(w.getProduct_price());
            newStock.setStock(w.getStock());
            wsr.save(newStock);
        }
        return "Warehouse stock updated!!!";
    }

    @Override
    public String addWarehouseStock(Warehousestock ws){
        try{
            Warehousestock _w = wsr.save(ws);
//            return new ResponseEntity<>(_w, HttpStatus.CREATED);
            return "Warehouse stock created successfully!!!";
        } catch(Exception e){
//            return new ResponseEntity<>(w , HttpStatus.OK);
            return "Warehouse stock cannot be created!!!";
        }
    }
}
