package visitor;

import compozit.Directory;
import compozit.RegularFile;
import compozit.SpecialFile;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CountingVisitorTest {

    private CountingVisitor countingVisitor = new CountingVisitor();
    private Directory root = new Directory("root");
    private Directory directory1 = new Directory("Test directory");
    private RegularFile regularFile = new RegularFile("Regular file", 5);
    private SpecialFile specialFile = new SpecialFile("Special file", 20, "Test attribute");

    @Before
    public void setUp() throws Exception {
        root.addSubNode(directory1);
        directory1.addSubNode(regularFile);
        directory1.addSubNode(specialFile);
    }

    @Test
    public void test_visit() {
        root.accept(countingVisitor);
        MatcherAssert.assertThat(countingVisitor.getCount(), is(4));
    }
}