package mediator;

/**
 * @author Pace2Car
 * @date 2019/1/7 12:15
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague colleague1 = new ConcreteColleague(mediator,"张三");
        ConcreteColleague colleague2 = new ConcreteColleague(mediator,"李四");
        ConcreteColleague colleague3 = new ConcreteColleague(mediator,"王五");

        colleague1.send("吃了吗？");
        colleague2.send("吃了");
        colleague3.send("我也吃了");
    }
}
