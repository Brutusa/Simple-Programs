/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

import java.util.Random;

public class Baby implements Runnable {
    int time;
    String name;

    Baby(String name) {
        this.name = name;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }

    public void run() {
        try {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake, feed me!!!");
        } catch (InterruptedException ie) {
            System.out.println("Error: " + ie.getMessage());
        }
    }
}
