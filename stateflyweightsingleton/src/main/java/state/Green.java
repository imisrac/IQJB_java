package state;

import flyweight.LightStatePool;

public class Green implements Lightstate {

    public Green() {
    }

    @Override
    public Lightstate next() {
        return LightStatePool.getInstance().getState("yellow");
    }

    @Override
    public String getState() {
        return "green";
    }

}
