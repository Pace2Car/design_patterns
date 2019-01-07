package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:22
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
