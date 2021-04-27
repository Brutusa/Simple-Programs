/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 14
*/

import java.util.Scanner;

public class Assignment7B {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input;
        int remainingBalnace = 0;
        char retry = 'n';

        do {
        System.out.println("1) Make a deposit, 2) Withdraw money, or 3) Invest money");
        input = scanner.nextInt();

        BankAccount chase = new BankAccount();


            switch (input) {
                case 1:
                    chase.addAmount();
                    break;
                case 2:
                    chase.subAmount();
                    break;
                case 3:
                    chase.invest();
                    break;
                default:
                    System.out.println("please enter correct option");
            }

            System.out.println("Would you like to retry? (Y/N)");

            retry = scanner.next().toLowerCase().charAt(0);

        } while (retry != 'n');

    }

    public static class BankAccount{
        int balance = 0;
        int remainingBalance = 0;

        BankAccount (){
            this.balance = 1000;
            this.remainingBalance = 0;
        }

        public void addAmount(){
            int deposit;
            System.out.println("Enter amount you would like to deposit: ");
            deposit = scanner.nextInt();
            int remainingBalance = balance + deposit;
            System.out.println("Your remaining balance is: " + remainingBalance);



        }

        public void subAmount(){
            int withdrawal;
            System.out.println("Enter amount you would like to withdraw: ");
            withdrawal = scanner.nextInt();
            remainingBalance = balance - withdrawal;
            System.out.println("Your remaining balance is: " + remainingBalance);
        }

        public void invest(){
            double percentage;
            System.out.println("Enter the percentage of your account (in decimal form) to invest: ");
            percentage = scanner.nextDouble();
            this.remainingBalance += balance - (balance * percentage);
            System.out.println("Your remaining balance is: " + (double)remainingBalance);
        }
    }
}
