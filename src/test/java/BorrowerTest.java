import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setup(){
        borrower = new Borrower("David");
        book = new Book("Harry Potter", "JK Rowling", "Fantasy");
        library = new Library(20);
    }

    @Test
    public void canGetName(){
        assertEquals("David", borrower.getName());
    }

    @Test
    public void canGetCurrentRentals(){
        assertEquals(0, borrower.currentRentals());
    }

    @Test
    public void canRentBookFromLibrary(){
        borrower.rentBook(library);
        assertEquals(1, this.borrower.currentRentals());
        assertEquals(0, this.library.currentStock());
    }

}
