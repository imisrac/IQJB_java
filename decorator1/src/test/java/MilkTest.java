import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MilkTest {

    private Milk milk;

    @Before
    public void setUp() throws Exception {
        milk = new Milk(new Coffee());
    }

    @Test
    public void test_price() {
        assertThat(milk.price(), is(350D));
    }
}