/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 8
*/
import java.util.Scanner;

public class Assignment4C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer, total = 1;

        System.out.print("Enter an integer: ");
        integer = scanner.nextInt();

        for(int i = 1; i <= integer; i++){
            total = i * total;
        }

        System.out.println("The factorial of " + integer + " is: " + total);


    }
}
