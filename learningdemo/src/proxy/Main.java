package proxy;

/**
 * @author Pace2Car
 * @date 2018/12/29 11:33
 */
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("mm");

        Proxy proxy = new Proxy(girl);

        proxy.giveGift();
    }
}
