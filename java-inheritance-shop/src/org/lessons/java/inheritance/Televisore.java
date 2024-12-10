package org.lessons.java.inheritance;


// Televisore Class Definition

public class Televisore extends Product {


    // Instance Variables Declaration

    private int screenSize;
    private boolean isSmart;

    //


    // Has-A Relation

    private Object processor = new Processor("SnapDragon", 10);

    private Object screen = new Screen("Super AMOLED", "8K");

    //


    // Smartphone Methods

    public Televisore(String name, String brand, float basePrice, int iva, int screenSize, boolean isSmart) {

        super(name, brand, basePrice, iva);

        this.screenSize = screenSize;
        this.isSmart = isSmart;

    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return("The screen size is " + this.screenSize + "inches");
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public String getIsSmart() {

        if (this.isSmart == true) {
            return("This TV is smart");
        } else {
            return("This TV isn't smart");
        }

    }

    //


}

//