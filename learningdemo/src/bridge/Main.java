package bridge;

/**
 * @author Pace2Car
 * @date 2019/1/4 17:31
 */
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
