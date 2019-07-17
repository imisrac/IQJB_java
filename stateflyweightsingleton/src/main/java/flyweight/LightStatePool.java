package flyweight;

import state.*;

import java.util.HashMap;
import java.util.Map;

public class LightStatePool {
    private static LightStatePool ourInstance = new LightStatePool();

    public static LightStatePool getInstance() {
        return ourInstance;
    }

    private LightStatePool() {
        this.lightstateMap.put("red", new Red());
        this.lightstateMap.put("redyellow", new RedYellow());
        this.lightstateMap.put("green", new Green());
        this.lightstateMap.put("yellow", new Yellow());
    }

    private Map<String, Lightstate> lightstateMap = new HashMap<>();

    public Lightstate getState(String name) {
        return lightstateMap.get(name);
    }

}
