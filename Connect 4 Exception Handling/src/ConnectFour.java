/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: Assignment 10
*/

public class ConnectFour {
    char[][] board = new char[6][7];
    String whoseTurn;
    char token;


    ConnectFour() {
        for (int i = 0; i < board.length; i++) {
            for (int k = 0; k < board[0].length; k++) {
                board[i][k] = ' ';
            }
        }

        whoseTurn = "Red";
        token = 'R';
    }

    @Override
    public String toString() {
        String to_return = "  0   1   2   3   4   5   6";
        for (int i = 0; i < 6; i++) {
            to_return += "\n-----------------------------\n";
            to_return += "| ";
            for (int j = 0; j < 7; j++) {
                to_return += board[i][j] + " | ";
            }
        }
        to_return += "\n-----------------------------\n";
        return to_return;
    }

    public void nextTurn() {
        if (whoseTurn.equals("Red")) {
            whoseTurn = "Yellow";
            token = 'Y';
        } else {
            whoseTurn = "Red";
            token = 'R';
        }
    }

    public int nextAvailablePosition(int columnNum) {

        int toReturn = 0;

        for (int i = board.length - 1; i >= 0; i--) {

            if (board[i][columnNum] == ' ') {
                    System.out.println("found empty row at row " + i + " column " + columnNum);
                    return i;
            } else if (board[0][columnNum] != ' ') {
                return -1;
            }
        }
        return toReturn;
    }

    public void dropPiece(int columnNum, char token) throws ColumnFull {

        if (nextAvailablePosition(columnNum) != -1) {
            board[nextAvailablePosition(columnNum)][columnNum] = token;
        } else {
            throw new ColumnFull("Column is full");
        }

    }


}
