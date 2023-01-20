package com.quinbay.warehouse.repository;

import com.quinbay.warehouse.model.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Warehouserepository extends JpaRepository<Warehouse, Integer> {


}
