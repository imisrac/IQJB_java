package state;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class LightStateEnumTest {

    private LightStateEnum lightStateEnum;

    @Before
    public void setUp() throws Exception {
        lightStateEnum = LightStateEnum.RED;
    }

    @Test
    public void test_1_change() {
        lightStateEnum = lightStateEnum.change();
        MatcherAssert.assertThat(lightStateEnum.getColor(), is(LightStateEnum.REDYELLOW.getColor()));
    }

    @Test
    public void test_full_cycle() {
        lightStateEnum = lightStateEnum.change();
        lightStateEnum = lightStateEnum.change();
        lightStateEnum = lightStateEnum.change();
        lightStateEnum = lightStateEnum.change();
        MatcherAssert.assertThat(lightStateEnum.getColor(), is(LightStateEnum.RED.getColor()));

    }
}