package mediator;

/**
 * @author Pace2Car
 * @date 2019/1/7 12:00
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague coll : colleagues) {
            if (coll != colleague) {
                coll.get(message);
            }
        }
    }
}
