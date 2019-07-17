package sinobstem;

public class ConsoleLogger extends Logger {
    @Override
    void handleMessage(String message) {
        System.out.println(message);
    }
}
