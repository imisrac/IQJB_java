import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;

public class BookTest {

    private Book book;

    @org.junit.Before
    public void setUp() throws Exception {
        book = new Book(8, "Test Author", "Test Title", LocalDateTime.of(1900, 1, 1, 0, 0, 0));
    }

    @Test
    public void test_tostring() {
        MatcherAssert.assertThat(book.toString(), is("Book{numberOfCopies=8, author='Test Author', title='Test Title', dateOfPublication=1900-01-01T00:00}"));
    }
}