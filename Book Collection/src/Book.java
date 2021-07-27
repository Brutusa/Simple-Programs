/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 5
*/


public class Book extends Item {
    private int isbn_number;
    private String author;

    Book(){

    }

    Book(String title, String author, int isbn_number){
        super(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    @Override
    public void getListing() {
        System.out.println("Book Name - " + getTitle());
        System.out.println("Author - " + getAuthor());
        System.out.println("ISBN# - " + getIsbn_number());
    }

    public int getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
