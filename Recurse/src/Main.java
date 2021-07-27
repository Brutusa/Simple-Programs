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

        /*if (count == numTimes) {
            return phrase;
        } else {
            return repeatNTimes(phrase, numTimes - 1);
        }*/

        while (count <= numTimes){
            return repeatNTimes(phrase, numTimes - 1);
        }



    }

    public static boolean isReverse(String string1, String string2) {

        boolean isMatched = false;
        // char[] stringRev = string2.toCharArray();
        String reversed = " ";

        if (string1.equals(reversed)) {
            return isMatched;
        } else {
            for (int i = string2.length() - 1; i >= 0; i--) {
                reversed += string2.charAt(i);
                return isReverse(string1, string2.substring(i - 1));
            }
        }

        return isMatched;
    }
}
