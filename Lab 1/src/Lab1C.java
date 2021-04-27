/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 1C
*/

// Program Lab1C.java
// Demonstrate the use of the Scanner class to read numeric data.
import java.util.Scanner;
public class Lab1C
{
    // Calculates fuel efficiency based on values entered by the user.
    public static void main (String[] args)
    {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the number of miles: ");
        miles = scan.nextInt();

        System.out.print ("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;
        System.out.println ("Miles Per Gallon: " + mpg);
    }
}