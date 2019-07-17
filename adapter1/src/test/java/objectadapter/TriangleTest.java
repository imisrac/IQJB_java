package objectadapter;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class TriangleTest {

    private Triangle triangle = new Triangle(3, 4, 5);

    @Test
    public void a() {
        MatcherAssert.assertThat(triangle.area(), is(6D));
    }

    @Test
    public void p() {
        MatcherAssert.assertThat(triangle.perimeter(), is(12D));
    }
}