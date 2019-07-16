import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ProductTest {

    private Product product;

    @Test
    public void test_coffee_with_milk() {
        MatcherAssert.assertThat(new Milk(new Coffee()).price(), is(350D));
    }

    @Test
    public void test_tea_with_honey() {
        MatcherAssert.assertThat(new Honey(new Tea()).price(), is(260D));
    }

    @Test
    public void test_coffee_with_milk_and_honey() {
        MatcherAssert.assertThat(new Honey(new Milk(new Coffee())).price(), is(430D));
    }
}