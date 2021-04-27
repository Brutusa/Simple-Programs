/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 8
*/

import java.util.Scanner;

public class Assignment4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents, currentHighest, iterationCompare;
        currentHighest = 0;
        iterationCompare = 0;

        System.out.print("Enter the number of students: ");
        numStudents = scanner.nextInt();

        System.out.println("Enter each student's name and score");

        String[] studentName = new String[numStudents];
        int[] studentScore = new int[numStudents];

        for (int i = 0; i < studentName.length; i++){
            System.out.println("Student: " + (i + 1));
            System.out.print("    Name: ");
            studentName[i] = scanner.next();

            System.out.print("    Score: ");
            studentScore[i] = scanner.nextInt();
        }

        for (int j = 0; j < studentName.length; j++) {
            if (studentScore[j] > currentHighest){
                currentHighest = studentScore[j];
                iterationCompare = j;
                }
            }


        System.out.println("Student with the highest score: " + studentName[iterationCompare] );
    }

}
