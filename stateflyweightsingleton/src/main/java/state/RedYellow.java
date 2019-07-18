package state;

import flyweight.LightStatePool;

public class RedYellow implements Lightstate {

    public RedYellow() {
    }

    @Override
    public Lightstate next() {
        return LightStatePool.getInstance().getState("green");
    }

    @Override
    public String getState() {
        return "redyellow";
    }

}
