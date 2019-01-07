package observer.eventdelegate;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:52
 */
public class StockObserver {

    public void closeStock(String event) {
            System.out.println(event + ", " + this + " 关闭股票，继续工作");
    }
}
