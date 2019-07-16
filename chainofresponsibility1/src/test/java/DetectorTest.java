import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DetectorTest {

    private D500 d500;
    private D1000 d1000;
    private D5000 d5000;
    private D10000 d10000;
    private D20000 d20000;

    @org.junit.Before
    public void setUp() {
        d500 = new D500(null);
        d1000 = new D1000(d500);
        d5000 = new D5000(d1000);
        d10000 = new D10000(d5000);
        d20000 = new D20000(d10000);
    }

    @Test
    public void test_500() {
        d20000.detect(500);
        MatcherAssert.assertThat(d500.getCount(), is(1));
    }

    @Test
    public void test_5500() {
        d20000.detect(5500);
        MatcherAssert.assertThat(d5000.getCount(), is(1));
        MatcherAssert.assertThat(d500.getCount(), is(1));
    }

    @Test
    public void test_115500() {
        d20000.detect(115500);
        MatcherAssert.assertThat(d20000.getCount(), is(5));
        MatcherAssert.assertThat(d10000.getCount(), is(1));
        MatcherAssert.assertThat(d5000.getCount(), is(1));
        MatcherAssert.assertThat(d500.getCount(), is(1));
    }
}