/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 10
*/
import java.util.Scanner;

public class Lab10C {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        for (int i = 0; i < input.toCharArray().length; i++){
            if (input.charAt(i) >= 97 && input.charAt(i) <= 122 ) {
                char converted = (char)(((int)input.charAt(i) + 13 - 97) % 26 + 97);
                System.out.print(converted);
            } else if (input.charAt(i) == ' '){
                System.out.print(' ');
            } else if (input.charAt(i) == '\''){
                System.out.print('\'');
            }
        }

    }
}
