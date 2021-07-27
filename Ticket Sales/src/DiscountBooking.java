/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class DiscountBooking extends Ticket {


    DiscountBooking() {

    }

    DiscountBooking(int numDays) {
        super();
        setNumDaysUntilGame(numDays);

        if (getNumDaysUntilGame() == 0) {
            setTicketPrice(75);
        } else {
            setTicketPrice(10);
        }
    }

    @Override
    public int getPrice() {
        return getTicketPrice();
    }

    @Override
    public String toString() {
        return "Ticket Number " + getTicketNumber() + " with a price of $" + getPrice() + " is a discount ticket for a game in " + getNumDaysUntilGame() + " days.";
    }
}
