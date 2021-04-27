/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 7
*/

import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize;
        boolean identical = true;

        System.out.print("Enter the size of the arrays: ");
        arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        int[] array2 = new int[arraySize];

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter array 1 slot " + i + ": ");
            array[i] = scanner.nextInt();
            System.out.print("Enter array 2 slot " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        for (int j = 0; j < array.length; j++){
           if (array[j] != array2[j]){
                identical = false;
           } else {
               identical = true;
           }
        }

        if (identical == true){
            System.out.println("The arrays are identical");
        } else {
            System.out.println("The arrays are not identical");
        }

    }
}
