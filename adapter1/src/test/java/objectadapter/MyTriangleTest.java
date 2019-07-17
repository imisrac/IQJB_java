package objectadapter;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyTriangleTest {

    private MyTriangle myTriangle = new MyTriangle(3, 4, 5);

    @Test
    public void a() {
        MatcherAssert.assertThat(myTriangle.a(), is(6D));
    }

    @Test
    public void p() {
        MatcherAssert.assertThat(myTriangle.p(), is(12D));
    }
}