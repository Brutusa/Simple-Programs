/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 4
*/

public class Account {
    private static int account_number = 10001;
    private int next_account_number;
    private double accountBalance;

    Account() {

        this.accountBalance = 0;
        next_account_number = account_number;
        account_number++;

    }

    Account(double balance) {
        setAccountBalance(balance);
        next_account_number = account_number;
        account_number++;
    }


    public int getAccount_number() {
        return this.next_account_number;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }
}
