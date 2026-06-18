package Question13;

public class LibrarySystem {

    public static void main(String[] args) {

        // Create EBook object
        EBook ebook = new EBook("Java Programming");


        // Create PhysicalBook object
        PhysicalBook book = new PhysicalBook("Database System");


        // Search books
        ebook.search("Java");

        book.search("Database");

    }
}