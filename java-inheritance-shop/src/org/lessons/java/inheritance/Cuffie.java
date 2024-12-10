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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return("Headphones color is " + this.color);
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public String getIsWireless() {

        if (this.isWireless == true) {
            return("This headphones are wireless");
        } else {
            return("This headphones aren't wireless");
        }

    }

    //


}

//