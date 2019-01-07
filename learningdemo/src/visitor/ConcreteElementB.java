package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:17
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationA() {
        System.out.println("B...");
    }
}
