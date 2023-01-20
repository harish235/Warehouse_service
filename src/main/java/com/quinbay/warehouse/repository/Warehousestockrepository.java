package com.quinbay.warehouse.repository;


import com.quinbay.warehouse.model.Warehousestock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Warehousestockrepository extends JpaRepository<Warehousestock, Integer> {

    Warehousestock findByWarehouseidAndProductid(String w_id, String P_id);
}
