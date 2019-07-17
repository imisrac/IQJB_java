package state;

import flyweight.LightStatePool;

public class Red implements Lightstate {

    private static Red ourInstance = new Red();

    public static Red getInstance() {
        return ourInstance;
    }

    public Red() {
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setLightstate(LightStatePool.getInstance().getState("redyellow"));
    }

    @Override
    public String getState() {
        return "RED";
    }
}
