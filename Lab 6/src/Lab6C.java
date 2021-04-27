/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 6
*/

import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNum, endingNum, sumOfOdds;


        System.out.print("Enter a starting number: ");
        startingNum = scanner.nextInt();
        System.out.print("Enter an ending Number: ");
        endingNum = scanner.nextInt();

        sumOfOdds = 0;



        if ( startingNum < endingNum ) {
            if (startingNum % 2 == 0) {
                startingNum++;
            }
            for (int i = startingNum; i <= endingNum; i += 2) {
                if (i % 2 != 0) {
                    sumOfOdds = sumOfOdds + i;
                }
            }
            System.out.println("Sum of odds is: " + sumOfOdds);
        } else if (startingNum > endingNum) {
            if (startingNum % 2 == 0) {
                startingNum--;
            }
            for (int i = startingNum; i >= endingNum; i -= 2) {
                if (i % 2 != 0) {
                    sumOfOdds = sumOfOdds + i;
                }
            }
            System.out.println("Sum of odds is: " + sumOfOdds);

        }
    }
}
