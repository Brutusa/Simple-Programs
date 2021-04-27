/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 5
*/
import java.util.Scanner;

public class Lab5A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char answer;

        System.out.print("Experiencing severe symptoms (Y/N)?" );
        answer = scanner.nextLine().toUpperCase().charAt(0);
        if (answer == 'Y'){
            System.out.println("Seek emergency care.");
        } else {
            System.out.print("Close contact with someone who has COVID (Y/N)?" );
            answer = scanner.nextLine().toUpperCase().charAt(0);
            if (answer == 'N'){
                System.out.print("If you experience other symptoms, isolate and get tested.");
            } else {
                System.out.print("Quarantine and get tested if you feel sick.");
            }
        }
    }
}
