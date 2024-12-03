package org.lessons.java.inheritance;

import java.util.Random;

// Class Definition

public class Product {

    // Instance Variables Declaration

    int code;
    String name;
    String description;
    float basePrice;
    float totalPrice;
    int iva;

    //


    // Product Methods

    Random randomCode = new Random();

    public Product (String name, String description, float basePrice, int iva) {

        this.code = randomCode.nextInt(999999);

        this.name = name;

        this.description = description;

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

    public String getFullName() {
        return("Product full name is: " + this.code + "-" + this.name);
    }

    //
}

//