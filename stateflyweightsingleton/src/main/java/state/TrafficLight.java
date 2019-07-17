package state;

import flyweight.LightStatePool;

public class TrafficLight {

    private Lightstate lightstate;

    public TrafficLight() {
        this.lightstate = LightStatePool.getInstance().getState("red");
    }

    public void change() {
        this.lightstate.next();
    }

    public Lightstate getLightstate() {
        return lightstate;
    }

    public void setLightstate(Lightstate lightstate) {
        this.lightstate = lightstate;
    }
}
