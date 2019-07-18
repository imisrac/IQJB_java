package accumulation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LambdaAccumulationTest {

    private LambdaAccumulation lambdaAccumulation = new LambdaAccumulation();

    @Test
    public void test_accumulate() {
        assertThat(lambdaAccumulation.accumulate(80, (init, value) -> init - value, init -> init % 2 == 1), is(375));
    }
}