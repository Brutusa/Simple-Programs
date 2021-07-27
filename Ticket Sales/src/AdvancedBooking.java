/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class AdvancedBooking extends Ticket {

    AdvancedBooking() {

    }

    AdvancedBooking(int numDays) {
        super();
        setNumDaysUntilGame(numDays);

        if (getNumDaysUntilGame() >= 15) {
            setTicketPrice(25);
        } else {
            setTicketPrice(50);
        }
    }


    @Override
    public int getPrice() {
        return getTicketPrice();
    }

    @Override
    public String toString() {
        return "Ticket Number " + getTicketNumber() + " with a price of $" + getPrice() + " for a game in " + getNumDaysUntilGame() + " days.";
    }
}
