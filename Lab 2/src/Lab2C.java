/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 2
*/
import java.util.Scanner;

public class Lab2C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int width, height, area, perimeter;

        System.out.print("Enter a width: ");
        width = scanner.nextInt();
        System.out.print("Enter a height: ");
        height = scanner.nextInt();
        area = width * height;
        perimeter = (width * 2) + (height * 2);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}
