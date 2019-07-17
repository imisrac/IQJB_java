package base;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RectangleTest {

    private Rectangle rectangle = new Rectangle(2, 3);

    @Test
    public void area() {
        MatcherAssert.assertThat(rectangle.area(), is(6D));
    }

    @Test
    public void perimeter() {
        MatcherAssert.assertThat(rectangle.perimeter(), is(10D));
    }
}