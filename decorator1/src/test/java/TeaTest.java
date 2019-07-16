import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TeaTest {

    private Tea tea;

    @Before
    public void setUp() throws Exception {
        tea = new Tea();
    }

    @Test
    public void test_price() {
        assertThat(tea.price(), is(180D));
    }
}