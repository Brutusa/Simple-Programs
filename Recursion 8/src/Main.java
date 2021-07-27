/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: ?
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String fold_string = paperFold(i);
            System.out.println("For " + i + " folds we get: " + fold_string + "\n");
        }
    }

    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += charArray[i];
        }

        return reversed;
    }

    public static String vee(String upDownIn) {
        if (upDownIn.equals("v")) {
            return upDownIn.replace('v', '^');
        } else {
            return upDownIn.replace('^', 'v');

        }
    }

    public static String paperFold(int foldNTimes) {
        String total = "";

        if (foldNTimes == 1) {
            return "v";
        } else {
            return vee(reverse(paperFold(foldNTimes)));
            //Sorry, I didn't have a lot of time to spend on my assignments this week.
        }
    }
}

