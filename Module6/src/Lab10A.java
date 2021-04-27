/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 10
*/

import java.util.Scanner;

public class Lab10A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = stringReplace(input);

        System.out.println(" ");
        System.out.print("That string has " + vowels + " vowels.");

    }


    public static int stringReplace(String input) {
        char[] array = input.toCharArray();
        int vowels = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                if (array[i] == 'a') {
                    array[i] = '*';
                    vowels++;
                } else if (array[i] == 'e') {
                    array[i] = '*';
                    vowels++;
                } else if (array[i] == 'i') {
                    array[i] = '*';
                    vowels++;
                } else if (array[i] == 'o') {
                    array[i] = '*';
                    vowels++;
                } else if (array[i] == 'u') {
                    array[i] = '*';
                    vowels++;
                } else if (array[i] == 'y') {
                    array[i] = '*';
                    vowels++;
                }
            }
        }

        for (int i = 0; i < array.length; i++)
            if (array[i] == ' ') {
                System.out.print(' ');
            } else {
                System.out.print(array[i]);
            }

        return vowels;
    }

}