/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

public class Lab1 {
    public static void main(String[] args) {
        char[][] results = new char[4][13];
        char[][] reversed = new char[4][13];


        results = make_forward();
        reversed = make_mirror(results);

        for (int i = 0; i < results.length; i++) {
            System.out.println(" ");
            for (int k = 0; k < results[0].length; k++) {
                System.out.print(results[i][k]);
            }
        }

        for (int i = 0; i < reversed.length; i++) {
            System.out.println(" ");
            for (int k = 0; k < reversed[0].length; k++) {
                System.out.print(reversed[i][k]);
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(" ");
            for (int k = 0; k < results[0].length; k++) {
                System.out.print(results[i][k]);
            }
            for (int j = 0; j < results[0].length;j++){
                System.out.print(reversed[i][j]);
            }
        }

    }

    public static char[][] make_forward() {

        char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }

    public static char[][] make_mirror(char[][] array) {

        char[][] reversed = new char[4][13];

        for (int k = 0; k < 4; k++) {

            int countUp = 0;
            int countDown = 12;

            for (int i = 13; i > 0; i--) {

                if (array[k][countUp] == '(') {
                    reversed[k][countDown] = ')';
                } else if (array[k][countUp] == ')') {
                    reversed[k][countDown] = '(';
                } else if (array[k][countUp] == '/') {
                    reversed[k][countDown] = '\\';
                } else if (array[k][countUp] == '\\') {
                    reversed[k][countDown] = '/';
                } else {
                    reversed[k][countDown] = array[k][countUp];
                }

                countUp++;
                countDown--;


            }
        }
        return reversed;
    }
}
