/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 7
*/

import java.util.*;

public class Main extends Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int num1, num2;
        Calculator calc = new Calculator();

        do {
            System.out.println("0 - Exit");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("Please Choose an Option: ");
            input = scanner.nextInt();

            if (input == 0) {
                continue;
            }
            System.out.print("Please enter the first number ");
            num1 = scanner.nextInt();
            System.out.print("Please enter the second number ");
            num2 = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println(calc.add(num1, num2));
                    break;
                case 2:
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(calc.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println(calc.divide(num1, num2));
            }
            System.out.println(" ");
        } while (input != 0);


    }
}
