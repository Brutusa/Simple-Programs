/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

import java.util.*;

public class Main {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        int option;
        do {
            System.out.println("1 Encrypt a message");
            System.out.println("2 Decrypt a message");
            System.out.println("3 Quit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("What is the message to encrypt?");
                    String plainMessage = scanner.nextLine();
                    String newMessage = caesar.encrypt(plainMessage);
                    System.out.println("Encrypted: " + newMessage.toLowerCase());
                    break;
                case 2:
                    System.out.println("What is the encrypted message?");
                    String encryptedMessage = scanner.nextLine();
                    String plainText = caesar.decrypt(encryptedMessage);
                    System.out.println("Plaintext: " + plainText.toLowerCase());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        } while (option != 3);
    }
}
