package com.quinbay.warehouse.model;

import javax.persistence.*;


@Entity
@Table(name="warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "warehouseid")
    String warehouse_id;

    @Column(name = "name")
    String warehouse_name;

    @Column(name = "address")
    String warehouse_address;

    @Column(name = "phone")
    String warehouse_phone;

    public Warehouse(int id, String warehouse_id, String warehouse_name, String warehouse_address, String warehouse_phone) {
        this.id = id;
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.warehouse_phone = warehouse_phone;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public String getWarehouse_phone() {
        return warehouse_phone;
    }

    public void setWarehouse_phone(String warehouse_phone) {
        this.warehouse_phone = warehouse_phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }



    public Warehouse() {
    }
}
