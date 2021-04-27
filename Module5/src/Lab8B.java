/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 8
*/
import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int slotNum;
        int target;
        boolean found = false;


        int[] swap = new int[15];

        for (int i = 0; i < swap.length; i++) {
            System.out.print("Enter slot " + i + ": ");
            slotNum = scanner.nextInt();
            swap[i] = slotNum;
        }

        System.out.print("Enter a target: ");
        target = scanner.nextInt();

        for (int k = 0; k < swap.length; k++) {
            System.out.print(swap[k] + "|");
        }

        System.out.print("\n");
            for (int i = 0; i < swap.length; i++)
            {
                System.out.print(i+ " ");
                if (swap[i] == target)
                    found = true;
            }

        System.out.print("\n");

        int low = 0, mid, high = swap.length;

        for (int j = 0; j < 4; j++)
        {
            mid = (low + high) / 2;

            System.out.print(swap[mid] + " ");

            if (target == swap[mid]){
                found = true;}
            else if (target < swap[mid]){
                high = mid;}
            else{
                low = mid;}
            if (low >= high - 1){
                found = false;}

        }


    }
}

