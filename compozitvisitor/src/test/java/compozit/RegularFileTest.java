package compozit;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RegularFileTest {

    private final String testFile1 = "Test file1";
    private RegularFile regularFile1 = new RegularFile(testFile1, 8);

    @Test
    public void test_draw() {
        MatcherAssert.assertThat(regularFile1.draw(), is(testFile1));
    }
}