/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 5
*/
import java.util.Scanner;

public class Lab5B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int day;
        int daysTill;
        int trueDay;

        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        day = scanner.nextInt();
        System.out.print("Enter the number of days until the meeting: ");
        daysTill = scanner.nextInt();

        trueDay = (day + daysTill) % 7;


        switch (trueDay){
            case 0:
                System.out.println("Meeting day is Sunday");
                break;
            case 1:
                System.out.println("Meeting day is Monday");
                break;
            case 2:
                System.out.println("Meeting day is Tuesday");
                break;
            case 3:
                System.out.println("Meeting day is Wednesday");
                break;
            case 4:
                System.out.println("Meeting day is Thursday");
                break;
            case 5:
                System.out.println("Meeting day is Friday");
                break;
            case 6:
                System.out.println("Meeting day is Saturday");
                break;
            default:
                break;
        }

    }
}
