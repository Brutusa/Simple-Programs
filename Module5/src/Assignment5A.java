/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 9
*/

import java.util.Scanner;

public class Assignment5A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String [] names = new String [5];

        System.out.println("Enter 5 names: ");

        for (int i = 0; i < names.length; i++){
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }


        for (int i = 0; i < names.length - 1; i++)
        {
            for (int j = i+1; j < names.length; j++)
            {
                if (names[i].compareToIgnoreCase(names[j]) > 0)
                {
                    String temp = names [j];
                    names [j] = names [i];
                    names [i] = temp;
                }
            }
        }

        System.out.println("Names in order are: ");

        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

    }
}
