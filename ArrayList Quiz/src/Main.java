/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 3
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        int option = 0;

        System.out.println("What would you like to do?");

        do {
            System.out.println("1. Add a question to the quiz");
            System.out.println("2. Remove a question from the quiz");
            System.out.println("3. Modify a question in the quiz");
            System.out.println("4. Take the quiz");
            System.out.println("5. Quit");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    quiz.add_question();
                    break;
                case 2:
                    quiz.remove_question();
                    break;
                case 3:
                    quiz.modify_question();
                    break;
                case 4:
                    quiz.give_quiz();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        } while (option != 5);

    }
}
