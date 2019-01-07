package adapter;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:57
 */
public class Forward extends AmericanPlayer {
    @Override
    void attack() {
        System.out.println("Forward attack");
    }

    @Override
    void defense() {
        System.out.println("Forward defense");
    }
}
