package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:15
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
