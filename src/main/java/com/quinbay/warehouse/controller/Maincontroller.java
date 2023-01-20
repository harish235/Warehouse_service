package com.quinbay.warehouse.controller;
import com.quinbay.warehouse.functions.Productinterface;
import com.quinbay.warehouse.functions.Warehouseinterface;
import com.quinbay.warehouse.functions.Warehousestockinterface;
import com.quinbay.warehouse.model.Product;
import com.quinbay.warehouse.model.Warehouse;
import com.quinbay.warehouse.model.Warehousestock;
import jdk.management.resource.ResourceRequestDeniedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.quinbay.warehouse.service.Warehouseservice;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Maincontroller {

    @Autowired
    Warehouseinterface warehouseinterface;

    @Autowired
    Productinterface productinterface;

    @Autowired
    Warehousestockinterface warehousestockinterface;

    @GetMapping("/warehouses")
    public List<Warehouse> getAllWarehouses(){
//        return warehouseinterface.findAll();
        return warehouseinterface.getAllWarehouses();
    }

    @GetMapping("/warehouses/{id}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable(value = "id") Integer warehouseId){
        return warehouseinterface.getwarehouse(warehouseId);
    }


    @PostMapping("/createWarehouse")
    public String createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseinterface.createWarehouse(warehouse);
    }

    @DeleteMapping("/deleteWarehouse")
    public ResponseEntity<HttpStatus> deleteWarehouse(@RequestParam int w_id){
        return warehouseinterface.deleteWarehouse(w_id);
    }

    @PostMapping("/addWarehouseStock")
    public String addWarehouseStock(@RequestBody Warehousestock ws){
        return warehousestockinterface.addWarehouseStock(ws);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productinterface.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "id") Integer productId){
        return productinterface.getProduct(productId);
    }

    @GetMapping("/productsbyname/{name}")
    public ResponseEntity<Product> getProductByName(@PathVariable(value = "name") String product_name){
        return productinterface.getProductByName(product_name);
    }


    @PostMapping("/createProduct")
    public String createProduct(@RequestBody Product product) {
        return productinterface.createProduct(product);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<HttpStatus> deleteProduct(@RequestParam int p_id){
        return productinterface.deleteProduct(p_id);
    }

    @GetMapping("/warehousestock")
    public List<Warehousestock> getAllWarehouseStock(){
        return warehousestockinterface.getAllWarehouseStock();
    }

    @PutMapping("/updateWarehouseStock")
    public String updateWarehouseStock(@RequestBody Warehousestock w){
        return warehousestockinterface.updateWarehouseStock(w);
    }
}
