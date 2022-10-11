// Name:		  Andujar Brutus
// Class:	  CS 3305/02
// Term:		  Fall 2022
// Instructor:  Carla McManus
// Assignment:  2 – Part 1 Factorial

import java.util.*;

public class RecursionOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //PRINT Enter a nonnegative integer:
        System.out.print("Enter a nonnegative integer: ");
        //number = INPUT scanner
        int number = scanner.nextInt();
        //PRINT "Factorial of " + number + " is " + procedure factorial(number)
        System.out.println("Factorial of " + number + " is " + factorial(number));

    }

    //PROCEDURE FACTORIAL(INPUT)
    public static int factorial(int input){
        //IF INPUT = 0
        if(input == 0){
            //RETURN 1
            return 1;
        //ELSE
        } else {
            //RETURN INPUT * PROCEDURE FACTORIAL(INPUT - 1)
            return input * factorial(input-1);
        }
    }
}
