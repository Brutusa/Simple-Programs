/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 14
*/

public class Assignment7A {

    public static void main(String[] args) {
            int [][] weather = new int [4][7];

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        System.out.print  ("----------------------------");

        for (int row = 0; row < 4; row++){

            for (int column = 0; column < 7; column++){
                weather[row][column] = (int)Math.floor(Math.random()*(100 - 0 +1) + 0);
            }
        }

        for (int row = 0; row < 4; row++){
            System.out.print("\n");
            for(int column = 0; column < 7; column++){
                System.out.print(weather[row][column] + "  ");
            }
        }


        System.out.println("\nWeek#  Average Weekly Temperature");
        System.out.println("----------------------------");
        averageWeek(weather);


        System.out.println("This month's average temperature is: " + averageMonth(weather));
    }

    public static void averageWeek(int array[][]){
        int temp = 0;
        int oneDArray[] = new int [array.length];

        for (int row = 0; row < array.length; row++){

            for (int column = 0; column < array[0].length;  column++){
                temp += array[row][column];
            }
            oneDArray[row] = temp / array[0].length;
            temp = 0;
        }

        for (int row = 0; row < array.length; row++){

            System.out.println((row + 1) + " " + oneDArray[row]);

            for (int column = 0; column < array[0].length; column++){

            }
        }
    }

    public static int averageMonth(int array[][]){
        int temp = 0;
        int oneDArray[] = new int [array.length];

        for (int row = 0; row < array.length; row++){

            for (int column = 0; column < array[0].length;  column++){
                temp += array[row][column];
            }
        }
        return temp / (array.length * array[0].length);
    }
}
