import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue = new ArrayList<>();
    public int getBookCount(){
        return catalogue.size();
    }
    public void addBook(Book aBook){
        catalogue.add(aBook);
    }
    public void initialize(){
        for(int i = 0; i < 20; i++){
            catalogue.add(new Book("Author " + i, "Title " + i));
        }
    }
}
