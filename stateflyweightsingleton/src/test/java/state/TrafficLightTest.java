package state;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TrafficLightTest {

    private TrafficLight trafficLight;

    @Before
    public void setUp() {
        trafficLight = new TrafficLight();
    }

    @Test
    public void test_red_on_init() {
        assertThat(trafficLight.getLightstate().getState(), is("red"));
    }

    @Test
    public void test_change() {
        trafficLight.change();
        assertThat(trafficLight.getLightstate().getState(), is("redyellow"));
    }

    @Test
    public void test_full_cycle() {
        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
        trafficLight.change();
        assertThat(trafficLight.getLightstate().getState(), is("red"));
    }
}