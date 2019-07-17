package builder1;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class ComputerTest {

    private Computer computer;

    @Test
    public void test_with_processor_only() {
        String processorType = "Intel i5";
        computer = new Computer.Builder().processor(new Processor(processorType)).build();
        MatcherAssert.assertThat(computer.getProcessor().getAttribute(), is(processorType));
    }

    @Test
    public void test_full_config() {
        String processorType = "Test Processor i5";
        computer = new Computer.Builder().processor(new Processor(processorType)).memory(new Memory("Test Memory 1024GB")).disk(new Disk("Test Disk 3TB")).display(new Display("Test Display 24")).build();
        MatcherAssert.assertThat(computer.getProcessor().getAttribute(), is(processorType));
    }
}