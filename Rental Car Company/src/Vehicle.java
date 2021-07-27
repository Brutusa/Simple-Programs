/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

public class Vehicle {
    private String make;
    private String model;
    private String color;
    private int currentMileage;
    private int originalCost;
    private boolean currentlyRented = false;

    Vehicle() {

    }

    Vehicle(String color, String make, String model, int currentMileage, int originalCost, boolean currentlyRented) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.currentMileage = currentMileage;
        this.originalCost = originalCost;
        this.currentlyRented = currentlyRented;
    }

    @Override
    public String toString() {
        if (getCurrentlyRented() == false) {
            return "Available: " + color  + " " + make + " " + model + " with " + currentMileage + " miles";
        } else {
            return "Rented: " + color + " " + make + " " + model + " with " + currentMileage + " miles";
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public int getOriginalCost() {
        return originalCost;
    }

    public boolean getCurrentlyRented(){
        return currentlyRented;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    public void setOriginalCost(int originalCost) {
        this.originalCost = originalCost;
    }

    public void setCurrentlyRented(boolean currentlyRented) {
        this.currentlyRented = currentlyRented;
    }
}
