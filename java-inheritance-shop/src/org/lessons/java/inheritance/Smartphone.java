package org.lessons.java.inheritance;


// Smartphone Class Definition

public class Smartphone extends Product {
    

    // Instance Variables Declaration

    private long imei;
    private int memory;

    //


    // Smartphone Methods

    public Smartphone (String name, String brand, float basePrice, int iva, long imei, int memory) {

        super(name, brand, basePrice, iva);

        this.imei = imei;
        this.memory = memory;

    }

    //


}

//