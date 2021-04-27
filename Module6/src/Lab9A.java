/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 9
*/
import java.util.Scanner;

public class Lab9A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter number 1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        num3 = scanner.nextInt();

        System.out.println("Min is " + min(num1, num2, num3));
        System.out.println("Max is " + max(num1, num2, num3));
        System.out.println("Average is " + average(num1, num2, num3));

    }

    public static int max (int x, int y, int z) {
        int max;

        if (x > y && x > z){
            max = x;
        } else if (y > x && y > z){
            max = y;
        } else {
            max = z;
        }

        return max;
    }

    public static int min (int x, int y, int z) {
        int min;

        if (x < y && x < z){
            min = x;
        } else if (y < x && y < z){
            min = y;
        } else {
            min = z;
        }

        return min;
    }

    public static double average (int x, int y, int z) {
        double average;
        average = (double)(x + y + z) / 3;

        return average;

    }
}
