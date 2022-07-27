/** A class modeling a book. */
public class Book {
    String title;

    /** Create a new book with title b. */
    public Book(String t) {
        title= t;
    }

    /** Print this book. */
    public void printBook() {
        System.out.println(title);
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("A Clockwork Orange");
        b.printBook();
    }
}