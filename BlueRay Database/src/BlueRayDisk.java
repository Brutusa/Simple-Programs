/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class BlueRayDisk {
    public String title;
    public String director;
    public int yearReleased;
    public double cost;

    BlueRayDisk(String title, String director, int yearReleased, double cost){
        this.title = title;
        this.director = director;
        this.yearReleased = yearReleased;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "$"+ cost + " " + yearReleased + " " + title + ", " + director;
    }
}
