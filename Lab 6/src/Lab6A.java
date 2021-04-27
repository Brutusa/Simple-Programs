/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 6
*/

import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args){
        String reply;
        boolean gotCookie;
        gotCookie = false;
        Scanner scanner = new Scanner(System.in);

        do {
        System.out.print("Gimme a cookie: ");
        reply = scanner.nextLine();

            if (reply.toLowerCase().equals("cookie")){
                gotCookie = true;
            }

        } while (gotCookie != true);



    }
}
