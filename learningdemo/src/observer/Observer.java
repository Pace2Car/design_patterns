package observer;

/**
 * @author Pace2Car
 * @date 2019/1/2 18:49
 */
public abstract class Observer {
    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
