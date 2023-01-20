package com.quinbay.warehouse.model;

import javax.persistence.*;
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "productid")
    String product_id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    int price;

    @Column(name = "gst")
    double gst;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public Product() {
    }

    public Product(int id, String product_id, String name, int price, double gst) {
        this.id = id;
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.gst = gst;
    }
}
