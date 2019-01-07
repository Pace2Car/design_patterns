package flyweight;

/**
 * @author Pace2Car
 * @date 2019/1/7 14:44
 */
public abstract class Flyweight {
    /**
     * 共享操作
     * @param extrinsicState 外部状态，在调用时传递
     */
    public abstract void operation(int extrinsicState);
}
