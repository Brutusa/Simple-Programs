/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 11
*/

import java.util.Scanner;

public class Assignment6B {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean repeat = true;
        do {
            System.out.println("Choose an option: 1)Convert currency 2) Convert weight 3) Convert distance 4) Convert time 5) Convert temperature ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter dollars");
                    float amount = scanner.nextFloat();
                    money(amount);
                    break;
                case 2:
                    System.out.println("Enter pounds");
                    float pounds = scanner.nextFloat();
                    weight(pounds);
                    break;
                case 3:
                    System.out.println("Enter the length in miles");
                    float miles = scanner.nextFloat();
                    length(miles);
                    break;
                case 4:
                    System.out.println("Enter the time");
                    int time = scanner.nextInt();
                    System.out.println("If this is before noon press 0. If this is after noon, press 1 ");
                    int timeAMPM = scanner.nextInt();
                    newTime(time, timeAMPM);
                    break;
                case 5:
                    System.out.println("Enter temperature");
                    float tempF = scanner.nextFloat();
                    newTemp(tempF);
                    break;
                default:
                    System.out.println("Please choose an option from the menu.");


            }

            System.out.println("Would you like to retry? (Y/N)");

            char retry = scanner.next().toLowerCase().charAt(0);

            if (retry == 'y'){
                repeat = true;
            } else if(retry == 'n'){
                repeat = false;
            } else {
                System.out.println("incorrect input.");
            }

        } while (repeat);
    }

    public static void money(float amount) {
        float euros = amount * 0.85f;
        System.out.println("Your money in euros is " + euros);
    }

    public static void weight(float pounds) {
        float kilos = pounds * 0.45f;
        System.out.println("The weight in kilograms is " + kilos);
    }

    public static void length(float miles) {
        float kiloms = miles * 1.60934f;
        System.out.println("The length in kilometers is " + kiloms);
    }

    public static void newTime(int time, int timeAMPM) {

        int convertedTime = 0;

        if (timeAMPM == 0) {
            convertedTime = time;
        } else if (timeAMPM == 1) {
            convertedTime = time + 12;
            if (convertedTime >= 24){
                convertedTime = convertedTime % 12;
            }
        }
        System.out.println("The time in 24 hour format is " + convertedTime);
    }

    public static void newTemp(float tempF) {
        float celsius = (tempF - 32) / 1.8f;
        System.out.println("The temperature in Celsius is " + celsius);
    }


}
