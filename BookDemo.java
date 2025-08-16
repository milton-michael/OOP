package mod2;

class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Technical Book");
        super.display();
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    @Override
    void display() {
        System.out.println("Story Book");
        super.display();
        System.out.println("Genre: " + genre);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("General OOP", "Milton");
        Book b2 = new Technical("Java in Depth", "James Gosling", "Programming");
        Book b3 = new Story("Harry Potter", "J.K. Rowling", "Fantasy Magic", "Fiction");

        System.out.println("--- Book Reference pointing to Book object ---");
        b1.display();

        System.out.println("\n--- Book Reference pointing to Technical object ---");
        b2.display();

        System.out.println("\n--- Book Reference pointing to Story object ---");
        b3.display();
    }
 // Milton Michael
 // 16/08/25
}