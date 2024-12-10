package org.lessons.java.inheritance;


// Televisore Class Definition

public class Televisore extends Product {


    // Instance Variables Declaration

    private int screenSize;
    private boolean isSmart;

    //


    // Smartphone Methods

    public Televisore(String name, String brand, float basePrice, int iva, int screenSize, boolean isSmart) {

        super(name, brand, basePrice, iva);

        this.screenSize = screenSize;
        this.isSmart = isSmart;

    }

    //


}

//