/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 8
*/

import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int slotNum;
        int counter = 0;

        int[] swap = new int[10];

        for (int i = 0; i < swap.length; i++) {
            System.out.print("Enter slot " + i + ": ");
            slotNum = scanner.nextInt();
            swap[i] = slotNum;
        }

        for (int i = 0; i < swap.length - 1; i++)
        {
            for (int j = i+1; j < swap.length; j++)
            {
                if (swap[j] < swap [i])
                {
                    int temp = swap [j];
                    swap [j] = swap [i];
                    swap [i] = temp;

                    counter++;
                }
            }

            for (int k = 0; k < swap.length; k++) {
                System.out.print(swap[k] + "|");
            }
            System.out.print(" Num swaps: " + counter + "\n");
        }
    }
}
