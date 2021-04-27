/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 9
*/

import java.util.Scanner;

public class Assignment5B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int vowels = 0;
        int cons = 0;
        int nums = 0;

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] array = input.toLowerCase().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                if (array[i] == 'a') {
                    vowels++;
                } else if (array[i] == 'e') {
                    vowels++;
                } else if (array[i] == 'i') {
                    vowels++;
                } else if (array[i] == 'o') {
                    vowels++;
                } else if (array[i] == 'u') {
                    vowels++;
                } else if (array[i] == 'y') {
                    vowels++;
                } else if (array[i] == '0') {
                    nums++;
                } else if (array[i] == '1') {
                    nums++;
                } else if (array[i] == '2') {
                    nums++;
                } else if (array[i] == '3') {
                    nums++;
                } else if (array[i] == '4') {
                    nums++;
                } else if (array[i] == '5') {
                    nums++;
                } else if (array[i] == '6') {
                    nums++;
                } else if (array[i] == '7') {
                    nums++;
                } else if (array[i] == '8') {
                    nums++;
                } else if (array[i] == '9') {
                    nums++;
                } else {
                    cons++;
                }
            }
        }

        System.out.println("Number of vowels is: " + vowels);
        System.out.println("Number of consonants is: " + cons);
        System.out.print("Number of numbers is: " + nums);
    }
}
