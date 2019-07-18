package state;

import flyweight.LightStatePool;

public class Red implements Lightstate {

    public Red() {
    }

    @Override
    public Lightstate next() {
        return LightStatePool.getInstance().getState("redyellow");
    }

    @Override
    public String getState() {
        return "red";
    }

}
