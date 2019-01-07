package flyweight;

/**
 * @author Pace2Car
 * @date 2019/1/7 14:45
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体的Flyweight：" + extrinsicState);
    }
}
