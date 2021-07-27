import java.util.*;
import java.io.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String lines, words;
        int lineCount = 0, wordCount = 0, charCount = 0;

        System.out.println("Enter a filename: ");
        String fileName = scanner.nextLine();


        try {
            File myFile = new File(fileName);
            Scanner scan = new Scanner(myFile);

            while (scan.hasNextLine()) {
                lines = scan.nextLine();
                lineCount++;
                String[] wordsArray = lines.split(" ");
                for (int i = 0; i < wordsArray.length; i++) {
                    words = wordsArray[i];
                    wordCount++;
                    for (int j = 0; j < wordsArray[i].length(); j++) {
                        if (wordsArray[i].charAt(j) != '.' && wordsArray[i].charAt(j) != ' ' && wordsArray[i].charAt(j) != ',') {
                            charCount++;
                        }
                    }
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Chars: " + charCount);


        } catch (IOException io) {
            System.out.println(io.getMessage());
        } finally {
            scanner.close();
        }
    }

}
