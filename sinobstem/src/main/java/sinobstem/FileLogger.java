package sinobstem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLogger extends Logger {

    private Path logFile;

    FileLogger() {
        try {
            logFile = Files.createTempFile("application-", ".log");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    void handleMessage(String message) {
        try {
            Files.write(logFile, message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Path getLogFile() {
        return logFile;
    }
}
