/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

import java.util.Random;

public class Guesser implements Runnable {
    public int threadID;
    public static int nextThreadID = 0;

    Guesser() {
        threadID = nextThreadID++;
    }

    public void run() {

        Random rand = new Random();
        int randNum = rand.nextInt();
        int guesses = 0;

        while (randNum != 123456) {
            randNum = rand.nextInt(1000000);
            guesses++;

            if (randNum == 123456) {
                System.out.println("I'm thread " + threadID + ", I just found the number on guess " + guesses);
            }

        }
    }

}
