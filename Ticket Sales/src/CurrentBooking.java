/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class CurrentBooking extends Ticket {

    CurrentBooking() {
        super();
        setTicketPrice(75);
    }

    @Override
    public int getPrice() {
        return getTicketPrice();
    }

    @Override
    public String toString() {
        return "Ticket Number " + getTicketNumber() + " with a price of $" + getPrice() + " for today's game.";
    }
}
