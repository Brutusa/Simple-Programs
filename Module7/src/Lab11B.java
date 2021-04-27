/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 11
*/

public class Lab11B {
    public static void main(String[] args) {

        Turtle one = new Turtle();
        Turtle two = new Turtle(5, "purple");

        System.out.println(one.speed);
        System.out.println(two.color);

    }


}

class Turtle {
    int speed;
    String color;

    Turtle() {
        color = "green";
        speed = 0;
    }

    Turtle(int initSpeed, String initColor) {
        color = initColor;
        speed = initSpeed;

    }
}