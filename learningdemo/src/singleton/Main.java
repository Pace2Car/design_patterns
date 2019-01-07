package singleton;

/**
 * @author Pace2Car
 * @date 2019/1/4 16:16
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}
