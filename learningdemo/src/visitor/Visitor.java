package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:14
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
