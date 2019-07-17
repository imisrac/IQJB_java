package base;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CircleTest {

    private Circle circle = new Circle(1);

    @Test
    public void area() {
        MatcherAssert.assertThat(circle.area(), is(Math.PI));
    }

    @Test
    public void perimeter() {
        MatcherAssert.assertThat(circle.perimeter(), is(Math.PI * 2));
    }
}