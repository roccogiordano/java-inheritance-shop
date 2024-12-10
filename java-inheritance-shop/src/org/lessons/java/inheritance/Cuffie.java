package org.lessons.java.inheritance;


// Cuffie Class Definition

public class Cuffie extends Product {


    // Instance Variables Declaration

    private String color;
    private boolean isWireless;

    //


    // Smartphone Methods

    public Cuffie(String name, String brand, float basePrice, int iva, String color, boolean isWireless) {

        super(name, brand, basePrice, iva);

        this.color = color;
        this.isWireless = isWireless;

    }

    //


}

//