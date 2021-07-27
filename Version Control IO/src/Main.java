/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 12
*/

import java.util.*;
import java.io.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner file1scan = null;
        Scanner file2scan = null;

        try {
            String line1 = " ";
            String line2 = " ";

            System.out.println("What is the name of the first file?");
            String name1 = scanner.nextLine();

            System.out.println("What is the name of the second file?");
            String name2 = scanner.nextLine();

            File file1 = new File(name1);
            File file2 = new File(name2);

            file1scan = new Scanner(file1);
            file2scan = new Scanner(file2);

            int file1LineCount = 0;
            int file2LineCount = 0;


            while (file1scan.hasNextLine()) {
                file1scan.nextLine();
                file1LineCount++;
            }

            while (file2scan.hasNextLine()) {
                file2scan.nextLine();
                file2LineCount++;
            }

            if (file1LineCount != file2LineCount) {
                System.out.println("Files have different number of lines");
                throw new IOException();
            } else {
                try {
                    file1scan = new Scanner(file1);
                    file2scan = new Scanner(file2);
                } catch (IOException ioex) {
                    System.out.println("Error: " + ioex.getMessage());
                }
                for (int i = 0; i < file1LineCount; i++) {

                    if (file1scan.hasNextLine()) {
                        line1 = file1scan.nextLine();
                        line2 = file2scan.nextLine();
                    }

                    if (!(line1.equals(line2))) {
                        System.out.println("Line " + (i+1));
                        System.out.println('<' + line1);
                        System.out.println('>' + line2);
                    }

                }
            }


        } catch (IOException ioe) {
            System.out.println("Error: " + ioe.getMessage());
        } finally {
            scanner.close();
            if (file1scan != null && file2scan != null) {
                file1scan.close();
                file2scan.close();
            }
        }


    }
}
