package mod1;
public class Book {
    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("JavaBasics", "James", 250.50);
        Book b2 = new Book("OOPConcepts", "Miller", 300.75);

        System.out.println("Book Details:");
        b1.displayBook();
        b2.displayBook();
    }
    // Milton Michael
    // 16/8/25
}