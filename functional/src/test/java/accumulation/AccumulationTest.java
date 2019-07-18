package accumulation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccumulationTest {

    private Accumulation accumulation = new Accumulation();

    @Test
    public void test_accumulate() {
        assertThat(accumulation.accumulate(8), is(63));
    }

    @Test
    public void test_accumulate_with_operation_add() {
        assertThat(accumulation.accumulate(3, new Add()), is(58));
    }

    @Test
    public void test_accumulate_with_operation_multiply() {
        assertThat(accumulation.accumulate(10, new Multiply()), is(36288000));
    }

    @Test
    public void test_accumulate_with_operation_and_predicate() {
        assertThat(accumulation.accumulate(24, new Add(), new Even()), is(54));
    }

    @Test
    public void test_accumulate_with_anonim_operation_and_anonim_predicate() {
        assertThat(accumulation.accumulate(80, new Operation() {
            @Override
            public int operate(int init, int value) {
                return init - value;
            }
        }, new Predicate() {
            @Override
            public boolean test(int init) {
                return init % 2 == 1;
            }
        }), is(55));
    }

    @Test
    public void test_accumulate_with_lambda() {
        assertThat(accumulation.accumulate(80, (init, value) -> init - value, init -> init % 2 == 1), is(55));
    }
}