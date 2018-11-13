import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> rentals;

    public Borrower(String name){
        this.name = name;
        this.rentals = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int currentRentals() {
        return this.rentals.size();
    }

    public void rentBook(Library library){
        Book bookRemoved = library.removeFromLibrary();
        this.rentals.add(bookRemoved);
    }
}
