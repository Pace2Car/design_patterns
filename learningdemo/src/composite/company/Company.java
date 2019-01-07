package composite.company;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:35
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void add(Company company);
    abstract void remove(Company company);
    abstract void display(int depth);

    abstract void doSomething();
}
