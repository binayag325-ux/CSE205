package Question13;

// EBook class implements Searchable interface
public class EBook implements Searchable {

    // Book title
    private String title;


    // Constructor
    public EBook(String title) {
        this.title = title;
    }


    // Implement search method
    @Override
    public void search(String keyword) {

        // Search inside digital book
        if (title.contains(keyword)) {
            System.out.println(
                    "EBook found: " + title
            );
        }
        else {
            System.out.println(
                    "EBook not found."
            );
        }
    }
}
