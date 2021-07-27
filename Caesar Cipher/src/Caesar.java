/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

import java.util.ArrayList;

class Caesar {
    ArrayList<Character> alphabet = new ArrayList<Character>();

    public Caesar() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
    }

    public int position_of_char(char charIn) {
        int index = alphabet.indexOf(charIn);
        return index;
    }

    public char letter_at_pos(int position) {
        char letter = alphabet.get(position);
        return letter;
    }

    public char encrypt_char(char charIn) {
        int charPos = position_of_char(charIn);
        int convertedCharNum = charPos + 3;

        if (convertedCharNum > 26) {
            convertedCharNum = convertedCharNum - 26;
        }

        char encryptedLetter = letter_at_pos(convertedCharNum);

        return encryptedLetter;
    }

    public char decrypt_char(char charIn) {
        int charPos = position_of_char(charIn);
        int convertedCharNum = charPos - 3;

        if (convertedCharNum < 0) {
            convertedCharNum = convertedCharNum + 26;
        }

        char decryptedLetter = letter_at_pos(convertedCharNum);

        return decryptedLetter;

    }

    public String encrypt(String stringIn) {
        String cipherText = "";

        ArrayList<Character> encryptCipherChar = new ArrayList<Character>();

        for (char c : cipherText.toCharArray()) {
            encryptCipherChar.add(c);
        }

        for (int i = 0; i < stringIn.length(); i++) {
            char target = stringIn.toLowerCase().charAt(i);
            char encryptedText = encrypt_char(target);
            cipherText = cipherText + encryptedText;
        }


        return cipherText;
    }

    public String decrypt(String stringIn) {
        String decipheredText = "";

        ArrayList<Character> decryptCipherChar = new ArrayList<Character>();

        for (char c : decipheredText.toCharArray()) {
            decryptCipherChar.add(c);
        }

        for (int i = 0; i < stringIn.length(); i++) {
            char target = stringIn.toLowerCase().charAt(i);
            char decryptedText = decrypt_char(target);
            decipheredText = decipheredText + decryptedText;
        }

        return decipheredText;
    }
}
