package compozit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DirectoryTest {

    private final String testDirectoryName = "Test directory";
    private Directory directory = new Directory("root");

    @Test
    public void test_draw_single_dir() {
        directory.addSubNode(new Directory(testDirectoryName));
        assertThat(directory.draw(), is(
                "root\n" +
                        "----" + testDirectoryName));
    }

    @Test
    public void test_draw_multiple_dir_in_root() {
        String subDirectoryName = "Sub directory";
        Directory testDirectory = new Directory(testDirectoryName);
        Directory subDirectory = new Directory(subDirectoryName);
        testDirectory.addSubNode(subDirectory);
        directory.addSubNode(testDirectory);

        assertThat(directory.draw(), is(
                "root\n" +
                        "----" + testDirectoryName + "\n" +
                        "--------" + subDirectoryName
        ));
    }
}