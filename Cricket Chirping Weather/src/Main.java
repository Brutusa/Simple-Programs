/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        ClemsonCricket clemCricket = new ClemsonCricket();
        int currentTemp;

        do {
            System.out.println("What is the current temperature? (Enter -1 to exit)");
            currentTemp = scanner.nextInt();

            if (currentTemp == -1) {
                continue;
            }

            Environment env = new Environment(currentTemp);
            System.out.println("Normal cricket: " + currentTemp + " degrees yields " + cricket.getChirpCount(env) + " chirps per minute");
            System.out.println("Clemson cricket: " + currentTemp + " degrees yields " + clemCricket.getChirpCount(env) + " chirps per minute");
        } while (currentTemp != -1);


    }
}
