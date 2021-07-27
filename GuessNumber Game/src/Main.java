/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[100];
        Guesser[] guessers = new Guesser[100];

        for (int i = 0; i < 100; i++){
            guessers[i] = new Guesser();
            threads[i] = new Thread(guessers[i]);
        }

        for (int i = 0; i < 100; i++){
            threads[i].start();
        }
    }
}
