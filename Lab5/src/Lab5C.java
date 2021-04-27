/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 5
*/
import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x, y;

        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        if (x == 0 && y == 0){
            System.out.println("This point is the origin.");
        } else if (x > 0 && y > 0){
            System.out.println("This point is in the first quadrant.");
        } else if (x < 0 && y < 0){
            System.out.println("This point is in the third quadrant.");
        } else if (x > 0 && y < 0){
            System.out.println("This point is in the fourth quadrant.");
        } else if (x < 0 && y > 0){
            System.out.println("This point is in the second quadrant.");
        } else if ((x < 0 || x > 0) && y == 0){
            System.out.println("This point is on the x axis.");
        } else if ((y < 0 || y > 0) && x == 0){
            System.out.println("This point is on the y axis.");
        }

    }
}
