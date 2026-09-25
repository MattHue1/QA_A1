import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    @DisplayName("Is the library empty")
    void RESP_01_test_1(){
        Library lib = new Library();
        int libSize = lib.getBookCount();
        assertEquals(0, libSize);
    }
    @Test
    @DisplayName("Library has one book.")
    void RESP_01_test_2(){
        Library lib = new Library();
        lib.addBook(new Book("AuthorName", "BookTitle"));
        int libSize = lib.getBookCount();
        assertEquals(1, libSize);
    }
    @Test
    @DisplayName("Library is initialized with 20 books.")
    void RESP_01_test_3() {
        Library lib = new Library();
        lib.initialize();
        assertEquals(20, lib.getBookCount());
    }
}
