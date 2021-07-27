/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 4
*/

public class Savings extends Account {

    public static int numDeposits = 0;

    Savings() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (getAccountBalance() > amount && getAccountBalance() >= 500) {
            super.withdraw(amount);
        } else {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdraw(10+amount);
        }
    }

    @Override
    public void deposit(double amount) {

        if (numDeposits < 5) {
            numDeposits++;
            System.out.println("This is deposit number " + numDeposits + " to this account.");
            super.deposit(amount);
        } else {
            numDeposits++;
            System.out.println("This is deposit number " + numDeposits + " to this account.");
            System.out.println("Charging a fee of $10.");
            super.deposit(amount);
            super.withdraw(10);
        }
    }

    public void interestYield() {
        double interestGained = getAccountBalance() * .015;

        System.out.println("Customer earned " + interestGained + " in interest");

        super.deposit(interestGained);
    }

}
