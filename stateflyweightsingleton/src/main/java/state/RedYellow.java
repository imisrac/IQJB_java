package state;

import flyweight.LightStatePool;

public class RedYellow implements Lightstate {

    private static RedYellow ourInstance = new RedYellow();

    public static RedYellow getInstance() {
        return ourInstance;
    }

    public RedYellow() {
    }

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setLightstate(LightStatePool.getInstance().getState("green"));
    }

    @Override
    public String getState() {
        return "RED-YELLOW";
    }
}
