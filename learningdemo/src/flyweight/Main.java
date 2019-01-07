package flyweight;

/**
 * @author Pace2Car
 * @date 2019/1/7 14:55
 */
public class Main {
    public static void main(String[] args) {
        int extrinsicState = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight x = flyweightFactory.getFlyweight("X");
        x.operation(--extrinsicState);

        Flyweight y = flyweightFactory.getFlyweight("Y");
        y.operation(--extrinsicState);

        Flyweight z = flyweightFactory.getFlyweight("Z");
        z.operation(--extrinsicState);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicState);

    }
}
