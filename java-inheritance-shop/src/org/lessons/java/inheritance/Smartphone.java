package org.lessons.java.inheritance;


// Smartphone Class Definition

public class Smartphone extends Product {
    

    // Instance Variables Declaration

    private long imei;
    private int memory;

    //


    // Has-A Relation

    private Object processor = new Processor("SnapDragon", 10);

    //


    // Smartphone Methods

    public Smartphone (String name, String brand, float basePrice, int iva, long imei, int memory) {

        super(name, brand, basePrice, iva);

        this.imei = imei;
        this.memory = memory;

    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public String getImei() {
        return("Smartphone IMEI is: " + this.imei);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return("Smartphone memory is: " + this.memory + "GB");
    }

    @Override public String getCode() {
        return(super.getCode() + " and this product is a smartphone!");
    }

    //


}

//