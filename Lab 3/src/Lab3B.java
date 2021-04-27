/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 3
*/
import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int course1, course2, course3, course4;
        float grade1, grade2, grade3, grade4, totalHours, qualityPoints;
        float GPA;

        System.out.print("Course 1 hours: ");
        course1 = scanner.nextInt();
        System.out.print("Grade for course 1: ");
        grade1 = scanner.nextInt();
        System.out.print("Course 2 hours: ");
        course2 = scanner.nextInt();
        System.out.print("Grade for course 2: ");
        grade2 = scanner.nextInt();
        System.out.print("Course 3 hours: ");
        course3 = scanner.nextInt();
        System.out.print("Grade for course 3: ");
        grade3 = scanner.nextInt();
        System.out.print("Course 4 hours: ");
        course4 = scanner.nextInt();
        System.out.print("Grade for course 4: ");
        grade4 = scanner.nextInt();
        totalHours = course1 + course2 + course3 +  course4;
        System.out.println("Total hours is: " + totalHours);
        qualityPoints = (grade1 * course1) + (grade2 * course2) + (grade3 * course3) + (grade4 * course4);
        System.out.println("Total quality points is: " + qualityPoints);
        GPA = qualityPoints / totalHours;
        System.out.println("Your GPA for this semester is " + GPA);

    }
}
