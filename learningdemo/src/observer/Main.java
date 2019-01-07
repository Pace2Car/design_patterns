package observer;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:55
 */
public class Main {
    public static void main(String[] args) {
        Secretary subject = new Secretary();

        StockObserver observer = new StockObserver("上班时间看股票", subject);
        StockObserver observer2 = new StockObserver("上班时间偷偷看股票", subject);

        subject.attach(observer);
        subject.attach(observer2);

        subject.setEvent("老板来了");
        subject.detach(observer2);
        subject.setEvent("老板走了");
    }
}
