/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 10
*/

import java.util.Scanner;

public class Lab10B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        replaceBadWord(input);

    }

    public static void replaceBadWord(String input) {
        char array[] = input.toLowerCase().toCharArray();

        String badWord = "dang";


        String censored = input;
        censored = censored.replace(badWord, "&^#@");


        int index = input.indexOf(badWord, 0);

        while (index >= 0){
            System.out.println("Found bad word at: " + index);
            index = input.indexOf(badWord, index + badWord.toCharArray().length + 1)   ;
        }


        System.out.println(censored);
    }

}

