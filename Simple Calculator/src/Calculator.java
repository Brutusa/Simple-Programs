/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 7
*/


public class Calculator implements CalcOp {

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        return a*b;
    }

    @Override
    public float divide(float a, float b) {
        return a/b;
    }
}
