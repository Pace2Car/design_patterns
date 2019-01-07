package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pace2Car
 * @date 2019/1/7 14:48
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
