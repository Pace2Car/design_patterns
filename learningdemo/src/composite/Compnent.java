package composite;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:07
 */
public abstract class Compnent {
    protected String name;

    public Compnent(String name) {
        this.name = name;
    }

    abstract void add(Compnent compnent);
    abstract void remove(Compnent compnent);

    abstract void display(int depth);
}
