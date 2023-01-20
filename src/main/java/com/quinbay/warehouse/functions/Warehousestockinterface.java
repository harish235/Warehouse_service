package com.quinbay.warehouse.functions;

import com.quinbay.warehouse.model.Warehouse;
import com.quinbay.warehouse.model.Warehousestock;

import java.util.List;

public interface Warehousestockinterface {

    String updateWarehouseStock(Warehousestock ws);

    List<Warehousestock> getAllWarehouseStock();

    String addWarehouseStock(Warehousestock w);

}
