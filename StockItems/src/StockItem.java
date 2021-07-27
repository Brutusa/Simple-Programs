/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

public class StockItem {
    private String description;
    private int id;
    private double price;
    private int quantity;
    private static int next_id = 0;

   public StockItem(){
        next_id++;
    }

    public StockItem(String description, double price, int quantity){
       this.id = next_id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        next_id++;
    }

    @Override
    public String toString() {
        return  "Item number: " + id + " is " + description + " has price " + price + " we currently have " + quantity + " in stock";
    }

    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be below zero!");
        } else {
            this.price = price;
        }
    }

    public void lowerQuantity(int lowQuantity){
        if ((this.quantity - lowQuantity) == 0){
            System.out.println("Quantity cannot drop below zero!");
        } else {
            this.quantity -= lowQuantity;
        }
    }

    public void raiseQuantity(int quantity){
            this.quantity += quantity;
    }
}
