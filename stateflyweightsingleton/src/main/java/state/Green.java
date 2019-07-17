package state;

import flyweight.LightStatePool;

public class Green implements Lightstate {

    private static Green ourInstance = new Green();

    public static Green getInstance() {
        return ourInstance;
    }

    public Green() {
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setLightstate(LightStatePool.getInstance().getState("yellow"));
    }

    @Override
    public String getState() {
        return "GREEN";
    }
}
