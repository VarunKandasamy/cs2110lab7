/** A class modeling a book. */
public class Book {
    String title;
    String author;
    int year;

    /** Create a new book with title b, author a, and year y */
    public Book(String t, String a, int y) {
        title= t;
        author = a;
        year=y;
    }
    
    /** Create a new book with title b and author a. */
    public Book(String t, String a) {
        title= t;
        author = a;
    }

    /** Create a new book with title b and year y. */
    public Book(String t, int y) {
        title= t;
        year=y;
    }

    /** Print this book. */
    public void printBook() {
        System.out.println(title + " (" + year + ")");
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("A Clockwork Orange", "Anthony Burgess", 1962);
        b.printBook();
    }
}