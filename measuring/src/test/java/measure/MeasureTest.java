package measure;

import org.junit.Test;

public class MeasureTest {

    private Measure measure = new Measure();

    @Test
    public void test_measure_old() {
        long measurementTime = measure.measure(Measure::sum1, 30_000_000L);
        System.out.println("old: " + measurementTime);
    }

    @Test
    public void test_measure_new() {
        long measurementTime = measure.measure(Measure::sum2, 30_000_000L);
        System.out.println("new: " + measurementTime);
    }

    @Test
    public void test_measure_new_parallel() {
        long measurementTime = measure.measure(Measure::sum2b, 30_000_000L);
        System.out.println("new, parallel: " + measurementTime);
    }

    @Test
    public void test_measure_with_object() {
        long measurementTime = measure.measure(Measure::sum3, 30_000_000L);
        System.out.println("with object: " + measurementTime);
    }

    @Test
    public void test_measure_with_object_parallel() {
        long measurementTime = measure.measure(Measure::sum3b, 30_000_000L);
        System.out.println("with object, parallel: " + measurementTime);
    }
}