/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 2
*/

import java.util.Scanner;

public class Lab2A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name1, name2, verb, adverb;

        System.out.print("Enter a name: ");
        name1 = scanner.nextLine();
        System.out.print("Enter another name: ");
        name2 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = scanner.nextLine();
        System.out.print("Once upon a time, there was a person named " + name1 + " who had a child named " +
                name2 + ". This child would " + verb + " " + adverb + " while singing to strangers.");

    }
}
