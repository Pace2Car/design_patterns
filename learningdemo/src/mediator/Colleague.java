package mediator;

/**
 * @author Pace2Car
 * @date 2019/1/7 11:56
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        mediator.colleagues.add(this);
    }

    public abstract void send(String message);
    public abstract void get(String message);
}
