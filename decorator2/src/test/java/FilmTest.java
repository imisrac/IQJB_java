import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.CoreMatchers.is;

public class FilmTest {

    private Film film;

    @Before
    public void setUp() throws Exception {
        film = new Film(6, "Test Director", "Test Title", LocalDateTime.of(1900, 1, 1, 0, 0, 0));
    }

    @Test
    public void test_tostring() {
        MatcherAssert.assertThat(film.toString(), is("Film{numberOfCopies=6, director='Test Director', title='Test Title', playTime='1900-01-01T00:00'}"));
    }
}