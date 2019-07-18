package state;

import flyweight.LightStatePool;

public class Yellow implements Lightstate {

    public Yellow() {
    }

    @Override
    public Lightstate next() {
        return LightStatePool.getInstance().getState("red");
    }

    @Override
    public String getState() {
        return "yellow";
    }

}
