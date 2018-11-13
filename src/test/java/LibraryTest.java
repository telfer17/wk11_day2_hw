import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setup(){
        library = new Library(50);
    }

    @Test
    public void libraryCapacity(){
        assertEquals(50, library.libraryCapacity());
    }

    @Test
    public void currentBooks(){
        assertEquals(0, library.currentStock());
    }

    @Test
    public void canAddABookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.currentStock());
    }

    @Test
    public void canAddManyBooksToLibrary(){
        int books = 20;
        for(int i = 0; i < books; i ++){
            library.addBook(book);
        }
        assertEquals(20, library.currentStock());
    }

    @Test
//    capacity for the library is 50, so it won't add any more books above that number.
    public void cantAddAnyMoreBooks(){
        int books = 52;
        for(int i = 0; i < books; i ++){
            library.addBook(book);
        }
        assertEquals(50, library.libraryCapacity());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book);
        library.removeFromLibrary();
        assertEquals(0, library.currentStock());
    }


}
