/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 3
*/
import java.util.Scanner;

public class Lab3A {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float amountOwed;
        float APR, APRper;
        float minimumPayment;
        float monthlyPerRate;

        System.out.print("Amount owed: $");
        amountOwed = scanner.nextFloat();
        System.out.print("APR: ");
        APR = scanner.nextFloat();
        monthlyPerRate =  APR / 12;
        System.out.println("Monthly percentage rate: " + monthlyPerRate);
        APRper = APR/100;
        minimumPayment = amountOwed * APRper / 12;
        System.out.println("Minimum payment: $" + minimumPayment);

    }
}
