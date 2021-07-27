/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 9
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;


        do {
            System.out.println("Choose from the following: ");
            System.out.println("0. Quit");
            System.out.println("1. Multiply 2 numbers");
            System.out.println("2. Div 2 numbers");
            System.out.println("3. Mod 2 numbers");

            option = scanner.nextInt();

            if (option == 0) {
                continue;
            }
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number");
            int num2 = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Answer: " + recursive_multiply(num1, num2));
                    break;
                case 2:
                    System.out.println("Answer: " + recursive_div(num1, num2));
                    break;
                case 3:
                    System.out.println("Answer: " + recursive_mod(num1, num2));
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 0);

    }

    public static int recursive_multiply(int num1, int num2) {
        if (num2 == 1) {
            return num1;
        } else if (num2 == 0) {
            return 0;
        }

        return num1 + recursive_multiply(num1, num2 - 1);
    }

    public static int recursive_div(int num1, int num2) {

        if (num2 == 0) {
            return -1;
        } else if (num1 == num2) {
            return 1;
        } else if (num1 < num2) {
            return 0;
        } else {

            return 1 + recursive_div(num1 - num2, num2);
        }

    }

    public static int recursive_mod(int num1, int num2) {

        if (num2 == 0) {
            return -1;
        } else if (num1 < num2) {
            return num1;
        }

        return recursive_mod(num1 - num2, num2);

    }
}
