import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoffeeTest {
    private Coffee coffee;

    @Before
    public void setUp() throws Exception {
        coffee = new Coffee();
    }

    @Test
    public void test_price() {
        assertThat(coffee.price(), is(250D));
    }
}