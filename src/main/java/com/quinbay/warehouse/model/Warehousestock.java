package com.quinbay.warehouse.model;

import javax.persistence.*;

@Entity
@Table(name="warehousestock")
public class Warehousestock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "warehouseid")
    String warehouseid;

    @Column(name = "productid")
    String productid;

    @Column(name = "price")
    int productprice;

    @Column(name = "stock")
    int stock;

    public Warehousestock() {
    }

    public Warehousestock(int id, String warehouse_id, String product_id, int product_price, int stock) {
        this.id = id;
        this.warehouseid = warehouse_id;
        this.productid = product_id;
        this.productprice = product_price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWarehouse_id() {
        return warehouseid;
    }

    public void setWarehouse_id(String warehouse_id) {
        this.warehouseid = warehouse_id;
    }

    public String getProduct_id() {
        return productid;
    }

    public void setProduct_id(String product_id) {
        this.productid = product_id;
    }

    public int getProduct_price() {
        return productprice;
    }

    public void setProduct_price(int product_price) {
        this.productprice = product_price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
