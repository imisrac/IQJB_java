package base;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SquareTest {

    private Square square = new Square(8);

    @Test
    public void test_area() {
        MatcherAssert.assertThat(square.area(), is(64D));
    }

    @Test
    public void test_perimeter() {
        MatcherAssert.assertThat(square.perimeter(), is(32D));
    }
}