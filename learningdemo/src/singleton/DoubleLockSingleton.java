package singleton;

/**
 * 双重锁的懒汉式
 * @author Pace2Car
 * @date 2019/1/4 16:27
 */
public class DoubleLockSingleton {
    private static DoubleLockSingleton instance;
    private static final Object root = new Object();

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (root) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
