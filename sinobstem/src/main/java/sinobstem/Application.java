package sinobstem;

import java.util.Observable;

public class Application extends Observable {

    private static Application applicationInstance;
    private String state;

    private Application() {
    }

    public static Application getApplicationInstance() {
        if (applicationInstance == null) {
            applicationInstance = new Application();
        }
        return applicationInstance;
    }

    void info() {
        state = "my info";
        setChanged();
        notifyObservers(state);
    }

    void error() {
        state = "my error";
        setChanged();
        notifyObservers(state);
    }

    String getState() {
        return state;
    }
}
