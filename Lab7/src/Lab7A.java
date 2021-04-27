/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 7
*/

import java.util.Scanner;

public class Lab7A {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        arraySize = scanner.nextInt();

        int array[] = new int[arraySize];

        for (int i = 0; i < array.length; i++){
            array[i] = i * i;
            System.out.print("|" + array[i]);
        }



    }
}
