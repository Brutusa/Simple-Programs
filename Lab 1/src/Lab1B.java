/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 1B
*/


// Program Lab1B.java
// Demonstrate reading a string from the user.
import java.util.Scanner;

public class Lab1B
{
    // Reads a character string from the user and prints it.
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter a line of text:");
        message = scan.nextLine();
        System.out.println ("You entered: \"" + message + "\"");
    }
}