/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: Assignment 10
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ConnectFour connect4 = new ConnectFour();
        int choice = -1;


        try {

            do {
                System.out.println(connect4);
                System.out.println("Which column would " + connect4.whoseTurn + " like to go in (9 to quit)");
                choice = scanner.nextInt();

                if (choice >= 0 && choice <= 6) {
                    connect4.dropPiece(choice, connect4.token);
                    connect4.nextTurn();
                }

            } while (choice != 9);

        } catch (ColumnFull cf) {
            System.out.println(cf.getMessage());
        }

    }

}
