/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Vehicle> cars = new ArrayList<Vehicle>();

        Economy_Car blueNissan = new Economy_Car("Blue", "Nissan", "Versa", 105, 14500, 25);
        Economy_Car whiteToyota = new Economy_Car("White", "Toyota", "Yaris", 8422, 17500, 25);
        Midsize_Car greenDodge = new Midsize_Car("Green", "Dodge", "Avenger", 15720, 15000, 45);
        Midsize_Car yellowFord = new Midsize_Car("Yellow", "Ford", "Focus", 2368, 14500, 45);
        SUV silverToyota = new SUV("Silver", "Toyota", "RAV4", 432, 26150, 80);

        cars.add(blueNissan);
        cars.add(whiteToyota);
        cars.add(greenDodge);
        cars.add(yellowFord);
        cars.add(silverToyota);

        int option;

        do {
            System.out.println("1. Rent cars");
            System.out.println("2. Return cars");
            System.out.println("3. Quit");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    rent_cars(cars);
                    break;
                case 2:
                    return_cars(cars);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
        } while (option != 3);


    }

    public static void show_cars(ArrayList<Vehicle> cars) {
        int i = 0;
        System.out.println(i + ". Return");

        for (Vehicle v : cars) {
            i++;
            System.out.println(i + ". " + v.toString());
        }
    }

    public static void rent_cars(ArrayList<Vehicle> cars) {
        int input;
        do {
            System.out.println("Choose a car to rent: ");
            show_cars(cars);
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) {
                continue;
            } else if (!cars.get(input - 1).getCurrentlyRented()) {
                cars.get(input - 1).setCurrentlyRented(true);
            }

        } while (input != 0);
    }

    public static void return_cars(ArrayList<Vehicle> cars) {
        int input;
        do {
            System.out.println("Choose a car to return: ");
            show_cars(cars);
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) {
                continue;
            } else if (cars.get(input - 1).getCurrentlyRented()) {
                cars.get(input - 1).setCurrentlyRented(false);
            }

        } while (input != 0);
    }
}

