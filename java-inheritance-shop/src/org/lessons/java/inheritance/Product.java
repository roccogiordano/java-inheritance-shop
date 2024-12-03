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

    public String getBasePrice() {
        return("Price before taxes is: " + basePrice);
    }

    public String getTotalPrice() {
        return("Price after taxes will be: " + totalPrice);
    }

    //
}

//