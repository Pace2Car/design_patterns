package mediator;

/**
 * @author Pace2Car
 * @date 2019/1/7 12:12
 */
public class ConcreteColleague extends Colleague {
    private String name;

    public ConcreteColleague(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(name + "发送消息：" + message);
        mediator.send(message, this);
    }

    @Override
    public void get(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
