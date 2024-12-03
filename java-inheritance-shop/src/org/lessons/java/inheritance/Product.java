package org.lessons.java.inheritance;

import java.util.Random;

// Class Definition

public class Product {

    // Instance Variables Declaration

    private int code;
    private String name;
    private String brand;
    private float basePrice;
    private float totalPrice;
    private int iva;

    //


    // Product Methods

    Random randomCode = new Random();

    public Product (String name, String brand, float basePrice, int iva) {

        this.code = randomCode.nextInt(999999);

        this.name = name;

        this.brand = brand;

        this.basePrice = basePrice;

        this.iva = iva;

        this.totalPrice = basePrice + (basePrice / 100 * iva);

    }

    public String getCode() {
        return("Product code is: " + this.code);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return("Product name is: " + this.name);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return("Product brand is: " + this.brand);
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getBasePrice() {
        return("Price before taxes is: " + this.basePrice);
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getIva() {
        return("Product IVA is: " + this.iva);
    }

    public String getTotalPrice() {
        return("Price after taxes will be: " + this.totalPrice);
    }

    //
}

//