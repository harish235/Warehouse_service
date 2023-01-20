package com.quinbay.warehouse.functions;

import com.quinbay.warehouse.model.Warehouse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;



public interface Warehouseinterface {

    List<Warehouse> getAllWarehouses();

    ResponseEntity<Warehouse> getwarehouse(int w_id);

    String createWarehouse(Warehouse w);

    ResponseEntity<HttpStatus> deleteWarehouse(int id);

}
