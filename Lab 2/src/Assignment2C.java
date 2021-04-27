/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 2
*/
import java.util.Scanner;

public class Assignment2C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double horizontalPixels, verticalPixels, pixelsPerInch, diagPixels, diagLength;

        System.out.println("Horizontal pixels: ");
        horizontalPixels = scanner.nextInt();
        System.out.println("Vertical pixels: ");
        verticalPixels = scanner.nextInt();
        System.out.println("Diagonal length in inches: ");
        diagLength = scanner.nextDouble();
        diagPixels = Math.sqrt((verticalPixels * verticalPixels) + (horizontalPixels * horizontalPixels));
        pixelsPerInch = diagPixels / diagLength;
        System.out.print("Pixels per inch: " + (int)pixelsPerInch);
    }
}
