package bridge;

/**
 * @author Pace2Car
 * @date 2019/1/4 17:30
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
