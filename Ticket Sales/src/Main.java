/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        int daysUntilTheGame = 0;

        ArrayList<Ticket> ticketsArray = new ArrayList<Ticket>();

        do {
            System.out.println("Choose from the following: ");
            System.out.println("1. Sell a Ticket for a future game");
            System.out.println("2. Sell a Ticket for today’s game");
            System.out.println("3. Sell a Discount Ticket");
            System.out.println("4. Print All Tickets");
            System.out.println("5. Exit");

            option = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.println("How many days until the game?");
                    daysUntilTheGame = scanner.nextInt();
                    AdvancedBooking advancedBooking = new AdvancedBooking(daysUntilTheGame);
                    ticketsArray.add(advancedBooking);
                    System.out.println("You sold: " + advancedBooking);
                    break;
                case 2:
                    CurrentBooking currentBooking = new CurrentBooking();
                    ticketsArray.add(currentBooking);
                    System.out.println("You sold: " + currentBooking);
                    break;
                case 3:
                    System.out.println("How many days until the game?");
                    daysUntilTheGame = scanner.nextInt();
                    DiscountBooking discountBooking = new DiscountBooking(daysUntilTheGame);
                    ticketsArray.add(discountBooking);
                    System.out.println("You sold: " + discountBooking);
                    break;
                case 4:
                    printTickets(ticketsArray);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println(" ");
        } while (option != 5);

    }

    public static void printTickets(ArrayList<Ticket> ticketsArray){
        System.out.println("Here are all the tickets you sold:");
        for (Ticket t : ticketsArray) {
            System.out.println(t);
        }
    }

}
