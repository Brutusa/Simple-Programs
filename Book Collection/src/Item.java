/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 5
*/

public abstract class Item {
    private String title;

    public abstract void getListing();


    Item() {
        this.title = " ";
    }

    Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title: " + title;
    }
}
