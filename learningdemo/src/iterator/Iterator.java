package iterator;

/**
 * @author Pace2Car
 * @date 2019/1/4 15:23
 */
public abstract class Iterator {
    public abstract Object first();
    public abstract Object next();
    public abstract boolean hasNext();
    public abstract Object currentItem();
}
