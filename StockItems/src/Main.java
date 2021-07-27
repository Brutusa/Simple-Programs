/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);

        int choice;

        do {
            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change Price of Milk");
            System.out.println("4. Change Price of Bread");
            System.out.println("5. Add Milk to Inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    milk.lowerQuantity(1);
                    break;
                case 2:
                    bread.lowerQuantity(1);
                    break;
                case 3:
                    System.out.println("What is the new price for the Milk");
                    double newPrice = scanner.nextDouble();
                    milk.setPrice(newPrice);
                    break;
                case 4:
                    System.out.println("What is the new price for the Bread");
                    newPrice = scanner.nextDouble();
                    bread.setPrice(newPrice);
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    int amount = scanner.nextInt();
                    milk.raiseQuantity(amount);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    amount = scanner.nextInt();
                    bread.raiseQuantity(amount);
                    break;
                case 7:
                    System.out.println("Milk: " + milk);
                    System.out.println("Bread: " + bread);
                    break;
                case 8:
                    continue;
                default:
                    System.out.println("Please choose an option from the menu.");
                    break;
            }

        } while (choice != 8);
    }
}