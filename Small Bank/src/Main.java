/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 4
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        Checking checking = new Checking();
        Savings savings = new Savings();

        do {
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings Now");
            System.out.println("8. Quit");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    double amountWithdrawC = scanner.nextDouble();
                    checking.withdraw(amountWithdrawC);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    double amountWithdrawS = scanner.nextDouble();
                    savings.withdraw(amountWithdrawS);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    double amountDepositC = scanner.nextDouble();
                    checking.deposit(amountDepositC);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    double amountDepositS = scanner.nextDouble();
                    savings.deposit(amountDepositS);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + checking.getAccount_number() + " is " + checking.getAccountBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " +savings.getAccount_number() + " is " + savings.getAccountBalance());
                    break;
                case 7:
                    savings.interestYield();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Please enter a valid option");

            }
        } while (option != 8);
    }
}
