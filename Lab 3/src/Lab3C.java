/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 3
*/
import java.util.Scanner;

public class Lab3C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int nickels, dimes, quarters, pennies, total, dollars, cents;

        System.out.print("Enter the number of quarters: ");
        quarters = scanner.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = scanner.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = scanner.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = scanner.nextInt();

        System.out.println("\nYou entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        total = (quarters*25) + (dimes*10) + (nickels*5) + pennies;
        dollars = total / 100;
        cents = total % 100;

        System.out.println("\nYour total is " + dollars + " dollars and " + cents + " cents.");

    }
}
