/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 2
*/
import java.util.Scanner;

public class Assignment2B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double width, length, squareFeet, area;
        double total;

        System.out.println("Width:");
        width = scanner.nextInt();
        System.out.println("Length:");
        length = scanner.nextInt();
        System.out.println("Square feet per dot:");
        squareFeet = scanner.nextInt();
        area = width * length;
        total = area / squareFeet;

        System.out.println("A yard of " + (int)area + " square feet will take " + total + " dots to cut.");

    }
}
