/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 11
*/

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int HoursMinutesSecs(String input) throws InvalidTimeException {

        String[] splitInput = input.split(":", 3);

        int hours = Integer.parseInt(splitInput[0]);
        int minutes = Integer.parseInt(splitInput[1]);
        int seconds = Integer.parseInt(splitInput[2]);

        if (hours > 23 || hours < 0) {
            throw new InvalidTimeException("Hour must be below 24");
        }

        if (minutes > 59 || minutes < 0) {
            throw new InvalidTimeException("Minutes must be less than 60");
        }

        if (seconds > 59 || seconds < 0) {
            throw new InvalidTimeException("Seconds must be less than 60");
        }

        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }

    public static void main(String[] args) {
        int converted1 = 0;
        int converted2 = 0;
        boolean thrown = true;

        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time1 = scanner.nextLine();
            converted1 = HoursMinutesSecs(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String time2 = scanner.nextLine();
            converted2 = HoursMinutesSecs(time2);
            thrown = false;

        } catch (InvalidTimeException ITE) {
            System.out.println(ITE.getMessage());
        } catch (Exception e){
            System.out.println("Enter a valid time");

        }

        if (!thrown){
            System.out.println("Difference in seconds: " + (converted2 - converted1));
        }


    }
}
