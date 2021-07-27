/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 5
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String option;

        ArrayList<Item> itemsList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter B for Book or P for Periodical");
            option = scanner.nextLine().toUpperCase();

            if (option.equals("B")) {
                System.out.println("Please enter the name of the Book");
                String bookTitle = scanner.nextLine();
                System.out.println("Please enter the author of the Book");
                String bookAuthor = scanner.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                int bookIsbn = scanner.nextInt();
                Item book = new Book(bookTitle, bookAuthor, bookIsbn);
                itemsList.add(book);
            } else if (option.equals("P")) {
                System.out.println("Please enter the name of the Periodical");
                String periodTitle = scanner.nextLine();
                System.out.println("Please enter the issue number");
                int issueNum = scanner.nextInt();
                Item periodical = new Periodical(periodTitle, issueNum);
                itemsList.add(periodical);
            } else {
                System.out.println("Please enter a valid option");
            }
            scanner.nextLine();
        }

        System.out.println("Your items:");
        for (int i = 0; i < 5; i++) {
            itemsList.get(i).getListing();
            System.out.println(" ");
        }
    }
}
