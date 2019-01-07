package iterator;

/**
 * @author Pace2Car
 * @date 2019/1/4 15:26
 */
public class ConcreateIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreateIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItem(0);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (current < aggregate.count()) {
            obj = aggregate.getItem(current);
        }
        current++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.getItem(current);
    }
}
