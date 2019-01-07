package flyweight;

/**
 * @author Pace2Car
 * @date 2019/1/7 14:47
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体的Flyweight：" + extrinsicState);
    }
}
