package singleton;

/**
 * 懒汉式
 * @author Pace2Car
 * @date 2019/1/4 16:15
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
