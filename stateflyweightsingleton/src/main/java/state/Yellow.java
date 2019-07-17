package state;

import flyweight.LightStatePool;

public class Yellow implements Lightstate {

    private static Yellow ourInstance = new Yellow();

    public static Yellow getInstance() {
        return ourInstance;
    }

    public Yellow() {
    }

    @Override
    public void next() {
        trafficLight.setLightstate(LightStatePool.getInstance().getState("red"));
    }

    @Override
    public String getState() {
        return "YELLOW";
    }
}
