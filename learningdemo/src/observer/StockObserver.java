package observer;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:52
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        if ("老板来了".equals(subject.getEvent())) {
            System.out.println(name + " 关闭股票，继续工作");
        } else {
            System.out.println(name + " 关闭工作，继续股票");
        }
    }
}
