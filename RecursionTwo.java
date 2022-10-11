// Name:		  Andujar Brutus
// Class:	  CS 3305/02
// Term:		  Fall 2022
// Instructor:  Carla McManus
// Assignment:  2 – Part 2 Recursion

import java.util.*;

public class RecursionTwo {
    public static void main(String[] args) {
        //Introduced the scanner to be used in keyboard input
        Scanner scanner = new Scanner(System.in);

        //Input a number to be used in recursion
        System.out.print("Input a number: ");
        //Set the keyboard input to an integer variable
        int inputNum = scanner.nextInt();
        //Print the results of the method directly
        //current is hardcoded at 1 in order to create a start point to be incremented/decremented
        System.out.println(recursiveCall(inputNum, 1));
    }

    public static String recursiveCall(int num, int curr){
        //two strings are created with slightly different contents
        String called1 = "This was written by call number " + curr + ".";
        //string with "ALSO" added in
        String called2 = "This was ALSO written by call number " + curr + ".";
        //base case for recursion
        //if current value is greater than target number
        if(curr > num){
            //return nothing
            return "";
            }
        //recursive calls
            return called1.indent(curr - 1) + recursiveCall(num, curr + 1) + called2.indent(curr - 1);

    }
}
