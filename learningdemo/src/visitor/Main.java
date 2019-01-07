package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:24
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementB());

        Visitor v1 = new ConcreteVisitor1();
        Visitor v2 = new ConcreteVisitor2();

        structure.accept(v1);
        structure.accept(v2);
    }
}
