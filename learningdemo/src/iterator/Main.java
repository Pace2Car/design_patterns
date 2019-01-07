package iterator;

/**
 * @author Pace2Car
 * @date 2019/1/4 15:37
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.setItems("aaa");
        aggregate.setItems("bbb");
        aggregate.setItems("ccc");
        aggregate.setItems("ddd");

        Iterator iterator = new ConcreateIterator(aggregate);

        Object first = iterator.first();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
