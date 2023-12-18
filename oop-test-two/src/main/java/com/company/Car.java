package com.company;

public class Car {
    private String color;
    private String model;
    private double price;
    private boolean auto;

    public Car(String color, String model, double price, boolean auto) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.auto = auto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }


    public void getInfo() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Auto system: " + (auto ? "true" : "false"));


    }

    public void getAutoInfo() {
        String systemType = auto ? "Auto" : "Mechanic";
        System.out.println("Auto system: " + systemType);
    }
}
