/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 7
*/

import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gpaNum;

        System.out.print("Enter the number of GPAs: ");
        gpaNum = scanner.nextInt();

        double [] gpaArray = new double [gpaNum];

        for (int i = 0; i < gpaArray.length; i++){
            System.out.print("GPA #" + i + ": ");
            gpaArray[i] = scanner.nextDouble();
        }

        for (int i = 0; i < gpaArray.length; i++){
            if (gpaArray[i] >= 3.9){
                System.out.println("Student #" + i + ":" + " Summa Cum Laude");
            } else if (gpaArray[i] >= 3.70 && gpaArray[i] <= 3.89){
                System.out.println("Student #" + i + ":" + " Magna Cum Laude");
            } else if (gpaArray[i] >= 3.50 && gpaArray[i] <= 3.69){
                System.out.println("Student #" + i + ":" + " Cum Laude");
            } else if (gpaArray[i] >= 2.0 && gpaArray[i] <= 3.499){
                System.out.println("Student #" + i + ":" + " Graduating");
            } else {
                System.out.println("Student #" + i + ":" + " Not graduating");
            }
        }

    }
}
