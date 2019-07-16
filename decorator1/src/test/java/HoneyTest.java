import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class HoneyTest {

    private Honey honey;

    @Before
    public void setUp() throws Exception {
        honey = new Honey(new Tea());
    }

    @Test
    public void test_price() {
        MatcherAssert.assertThat(honey.price(), is(260D));
    }
}