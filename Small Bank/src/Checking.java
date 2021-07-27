/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 4
*/

public class Checking extends Account {

    Checking() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (getAccountBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            super.withdraw(20+amount);
        }
    }
}
