/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 6
*/

import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        int min = 1001;
        int max = -1001;

        while (input != 0) {
            System.out.print("Enter a number between -1000 and +1000: ");
            input = scanner.nextInt();

            if (input != 0) {
                if (input < min) {
                    min = input;
                    if (max == -1001) {
                        max = input;
                    }

                } else if (input > max) {
                    max = input;
                    if (min == 1001) {
                        min = input;

                    }

                }
            }
            System.out.println("Min is: " + min);
            System.out.println("Max is: " + max);
        }
    }
}
