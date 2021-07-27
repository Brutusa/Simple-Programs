/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 3
*/

import java.util.*;

public class Quiz {
    int questions;

    Scanner scanner = new Scanner(System.in);

    ArrayList<Question> questionsArray = new ArrayList<Question>();

    public void add_question() {
        System.out.println("What is the question Text?");
        String questionAdd = scanner.nextLine();

        System.out.println("What is the answer?");
        String answerAdd = scanner.nextLine();

        System.out.println("How Difficult (1-3)?");
        int difficultyAdd = scanner.nextInt();
        int difficultyAddChecked = 0;

        if (difficultyAdd >= 1 && difficultyAdd <= 3) {
            difficultyAddChecked = difficultyAdd;
        } else {
            System.out.println("Choose an option from 1 to 3");
        }

        scanner.nextLine();

        Question anotherQuestion = new Question(questionAdd, answerAdd, difficultyAddChecked);

        questionsArray.add(anotherQuestion);

    }


    public void remove_question() {
        System.out.println("Choose the question to remove?");
        int i = 0;
        for (Question ques : questionsArray) {

            System.out.println(i + ". " + ques.getQuestionText());
            i++;
        }

        int removeChoice = scanner.nextInt();

        if (removeChoice < questionsArray.size()){
            questionsArray.remove(removeChoice);
        } else {
            System.out.println("Invalid option");
        }

        scanner.nextLine();

    }

    public void modify_question() {
        System.out.println("Choose the question to modify?");

        int i = 0;
        for (Question ques : questionsArray) {
            System.out.println(i + ". " + ques.getQuestionText());
            i++;
        }

        int questionToModify = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the question Text?");
        String questionMod = scanner.nextLine();

        System.out.println("What is the answer?");
        String answerMod = scanner.nextLine();

        System.out.println("How Difficult (1-3)?");
        int difficultyMod = scanner.nextInt();
        scanner.nextLine();
        int difficultyModChecked = 0;

        if (difficultyMod >= 1 && difficultyMod <= 3) {
            difficultyModChecked = difficultyMod;
        } else {
            System.out.println("Choose an option from 1 to 3");
        }


        Question anotherQuestion = new Question(questionMod, answerMod, difficultyModChecked);

        questionsArray.set(questionToModify, anotherQuestion);

    }

    public void give_quiz() {
        int correct = 0;
        int numQuestions = 0;

        for (Question quiz : questionsArray) {
            System.out.println(quiz.getQuestionText());

            numQuestions++;

            String reply = scanner.nextLine();

            if (quiz.getQuestionAnswer().equalsIgnoreCase(reply)) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("Incorrect");
            }
        }

        System.out.println("You got " + correct + " out of " + numQuestions);


    }


}
