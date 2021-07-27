/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 1
*/

public class Assignment1 {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++){
            Circle loopCircle = new Circle(i);
            System.out.println("Area of a circle with radius " + i + " is " + loopCircle.area() + " circumference is " + loopCircle.circumference());
        }

        for (int i = 1; i <= 3; i++){
            for (int k = 1; k <=3; k++){
                Rectangle loopRectangle = new Rectangle(i, k);
                System.out.println("Area of a rectangle " + i + " by " + k + " is " + (int)loopRectangle.area() + " it's perimeter is " + (int)loopRectangle.perimeter());

            }
        }

        Triangle coolTriangle = new Triangle(18, 30, 24);

        System.out.println("Area of a triangle 18x30x24 is " + (int)coolTriangle.area() + " it's perimeter is " + (int)coolTriangle.perimeter()
        + " and it's height is " + (int)coolTriangle.hieght());

        Triangle decentTriangle = new Triangle();

        System.out.println("Area of a triangle 3x4x5 is " + (int)decentTriangle.area() + " it's perimeter is " + (int)decentTriangle.perimeter()
                + " and it's height is " + (int)decentTriangle.hieght());
    }
}

class Circle {
    private double radius;

    Circle(double setRadius) {
        this.radius = setRadius;
    }

    public double circumference() {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    public double perimeter() {
        double peri = side1 + side2 + side3;
        return peri;
    }

    public double area() {
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
        return area;
    }

    public double hieght() {
        double smallestSide;

        if (side1 < side2) {
            smallestSide = side1;
        } else if (side3 < side1) {
            smallestSide = side3;
        } else {
            smallestSide = side2;
        }

        double hieght = (area() * 2) / smallestSide;
        return hieght;
    }

    @Override
    public String toString() {
        return "Triangle has sides " + side1 + ", " + side2 + ", " + side3 + ". It has an area of " + area() + " and a perimeter of "
                + perimeter() + ".";
    }

}

class Rectangle {
    private double height;
    private double width;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        double peri = (2 * height) + (2 * width);
        return peri;
    }

    public double area() {
        double area = height * width;
        return area;
    }

}