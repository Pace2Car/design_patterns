package adapter;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:59
 */
public class Guard extends AmericanPlayer {
    @Override
    void attack() {
        System.out.println("Guard attack");
    }

    @Override
    void defense() {
        System.out.println("Guard defense");
    }
}
