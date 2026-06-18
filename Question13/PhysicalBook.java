package Question13;

// PhysicalBook class implements Searchable interface
public class PhysicalBook implements Searchable {

    // Book title
    private String title;


    // Constructor
    public PhysicalBook(String title) {
        this.title = title;
    }


    // Implement search method
    @Override
    public void search(String keyword) {

        // Search in physical library record
        if (title.contains(keyword)) {
            System.out.println(
                    "Physical Book found: " + title
            );
        }
        else {
            System.out.println(
                    "Physical Book not found."
            );
        }
    }
}