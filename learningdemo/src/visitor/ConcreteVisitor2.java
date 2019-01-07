package visitor;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:19
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问");
    }
}
