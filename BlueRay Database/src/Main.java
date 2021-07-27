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
        int option = -1, yearReleased;
        String title, director;
        double cost;

        BlueRayCollection library = new BlueRayCollection();

        while (option != 0) {

            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to collection");
            System.out.println("2. See collection");
            System.out.println("3. Search collection");
            System.out.println("4. Remove BlueRay from collection");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0) {
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("What is the title?");
                    title = scanner.nextLine();
                    System.out.println("What is the director?");
                    director = scanner.nextLine();
                    System.out.println("What is the year of release?");
                    yearReleased = scanner.nextInt();
                    System.out.println("What is the cost?");
                    cost = scanner.nextDouble();
                    library.addBack(title, director, yearReleased, cost);
                    break;
                case 2:
                    library.showAll();
                    break;
                case 3:
                    System.out.println("What title to search for?");
                    String findTitle = scanner.nextLine();
                    library.search(findTitle);
                    break;
                case 4:
                    System.out.println("What title to remove?");
                    String findTitleDel = scanner.nextLine();
                    library.remove(findTitleDel);
                    break;
                default:


            }

        }
    }
}
