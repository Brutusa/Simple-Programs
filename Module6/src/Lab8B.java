/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 9
*/

import java.util.Scanner;

public class Lab8B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int initArray[] = new int [10];
        boolean quit = false;

        do {
            printMenu();

            int input = scanner.nextInt();


            switch (input){
                case 1:
                    enterNum(initArray);
                    break;
                case 2:
                    printArray(initArray);
                    break;
                case 3:
                    printSum(initArray);
                    break;
                case 4:
                    initArray(initArray);
                    break;
                case 5:
                    quit = true;
                    break;
                default:
            }
        } while(!quit);

    }

    public static void printArray (int[] initArray){
        for (int i = 0; i < initArray.length; i++){
            System.out.print("|" + initArray[i]);
        }
        System.out.println("");
    }

    public static void initArray (int[] initArray){
        for (int i = 0; i < initArray.length; i++){
            initArray[i] = 0;
        }
    }

    public static void printSum (int[] initArray){
        int sum = 0;
        for (int i = 0; i < initArray.length; i++){
            sum = initArray[i] + sum;
        }

        System.out.println(sum);

    }

    public static void enterNum (int[] initArray){
        System.out.print("Enter the slot: ");
        int slot = scanner.nextInt();
        System.out.print("Enter the new value: ");
        int value = scanner.nextInt();

        for (int i = 0; i < initArray.length; i++){
            if (i == slot){
                initArray[i] = value;
            }
        }
    }

    public static void printMenu (){
        System.out.println("Would you like to:");
        System.out.println("1) Enter a number");
        System.out.println("2) Print the array");
        System.out.println("3) Find the sum of the array");
        System.out.println("4) Reset the array");
        System.out.println("5) Quit");
    }

}
