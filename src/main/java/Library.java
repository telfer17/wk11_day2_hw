import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int libraryCapacity(){
        return this.capacity;
    }

    public int currentStock(){
        return this.stock.size();
    }

    public void addBook(Book book){
        if(this.currentStock() < this.capacity) {
            this.stock.add(book);
        }
    }
}
