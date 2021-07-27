/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/


public class Environment {
    private int currentTemp;

    Environment(int temp){
        this.currentTemp = temp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

}
