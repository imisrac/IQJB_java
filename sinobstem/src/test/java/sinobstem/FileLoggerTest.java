package sinobstem;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

public class FileLoggerTest {

    private FileLogger fileLogger = new FileLogger();
    private Application application = Application.getApplicationInstance();

    @Before
    public void setUp() {
        application.addObserver(fileLogger);
    }

    @Test
    public void handleMessage() throws IOException {
        application.info();
        assertTrue(Files.lines(fileLogger.getLogFile()).anyMatch(s -> s.equals("my info")));
    }
}