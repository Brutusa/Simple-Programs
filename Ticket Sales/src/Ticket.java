/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public abstract class Ticket {
    static int nextTicketNumber = 1;
    private int ticketNumber;
    private int ticketPrice;
    private int numDaysUntilGame;


    Ticket() {
        ticketNumber = nextTicketNumber++;
    }

    Ticket(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        ticketNumber = nextTicketNumber++;
    }

    public abstract int getPrice();

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setNumDaysUntilGame(int numDaysUntilGame) {
        this.numDaysUntilGame = numDaysUntilGame;
    }

    public int getNumDaysUntilGame() {
        return numDaysUntilGame;
    }

    @Override
    public String toString() {
        return "Ticket Number " + ticketNumber + " with a price of $" + getPrice();

    }
}
