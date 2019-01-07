package adapter;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:59
 */
public class Center extends AmericanPlayer {
    @Override
    void attack() {
        System.out.println("Center attack");
    }

    @Override
    void defense() {
        System.out.println("Center defense");
    }
}
