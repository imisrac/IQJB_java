package sinobstem;

import java.util.Observable;
import java.util.Observer;

public abstract class Logger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Application) {
            handleMessage(String.valueOf(arg));
        }
    }

    abstract void handleMessage(String message);

}
