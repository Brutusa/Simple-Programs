/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 10
*/


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

        System.out.println("Enter the first string");
        String s1 = scanner.nextLine();

        System.out.println("Enter the second string");
        String s2 = scanner.nextLine();

        if (isReverse(s1, s2)) {
            System.out.println(s1 + " is the reverse of " + s2);
        } else {
            System.out.println(s1 + " is not the reverse of " + s2);
        }

    }

    public static String repeatNTimes(String phrase, int numTimes) {

        int count = 0;

        if (count == numTimes - 1) {
            return phrase;
        } else {
            return phrase + repeatNTimes(phrase, numTimes - 1);
        }


    }

    public static boolean isReverse(String string1, String string2) {

        boolean isMatched = false;
        char[] charArray = string2.toCharArray();
        int i = 0;
        String reversed = "";

        for (i = string2.length() - 1; i >= 0; i--) {
            reversed = reversed + charArray[i];
        }

        if (string1.equals(reversed)) {
            isMatched = true;
        }

        if(string2.charAt(0) == reversed.charAt(0)) {
            return isReverse(string1, string2.substring(1, string2.length() - 1));
        }



        return isMatched;
    }
}
