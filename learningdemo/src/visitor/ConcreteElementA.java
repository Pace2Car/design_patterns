package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:16
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
        System.out.println("A...");
    }
}
