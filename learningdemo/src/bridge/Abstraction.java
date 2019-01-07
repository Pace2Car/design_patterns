package bridge;

/**
 * @author Pace2Car
 * @date 2019/1/4 17:28
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
