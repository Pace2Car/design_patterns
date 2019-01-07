package observer.eventdelegate;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:55
 */
public class Main {
    public static void main(String[] args) {
        Secretary subject = new Secretary();

        StockObserver observer = new StockObserver();
        StockObserver observer2 = new StockObserver();

        subject.setEvent("老板来了");
        subject.addObserver(observer, "closeStock", subject.getEvent());
        subject.addObserver(observer2, "closeStock", subject.getEvent());

        subject.notifyObservers();
    }
}
