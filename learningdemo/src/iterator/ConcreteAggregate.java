package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/4 15:27
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreateIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public void setItems(Object item) {
        items.add(item);
    }
}
