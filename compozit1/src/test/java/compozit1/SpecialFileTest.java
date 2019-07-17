package compozit1;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class SpecialFileTest {

    private Directory root = new Directory("root");
    private Directory directory1 = new Directory("directory1");
    private Directory directory2 = new Directory("directory2");
    private SpecialFile specialFile = new SpecialFile("Test special file", 88, "test attribute");

    @Before
    public void setUp() throws Exception {
        root.addSubNode(directory1);
        directory1.addSubNode(directory2);
        directory1.addSubNode(specialFile);
    }

    @Test
    public void test_draw() {
        MatcherAssert.assertThat(root.draw(), is(
                "root\n" +
                        "----directory1\n" +
                        "--------directory2\n" +
                        "--------Test special file"));
    }
}