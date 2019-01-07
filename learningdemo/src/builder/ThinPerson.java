package builder;

/**
 * @author Pace2Car
 * @date 2019/1/2 17:39
 */
public class ThinPerson extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("瘦脑袋");
    }

    @Override
    public void buildBody() {
        System.out.println("瘦身体");
    }

    @Override
    public void buildLeftHand() {
        System.out.println("瘦左手");
    }

    @Override
    public void buildRightHand() {
        System.out.println("瘦右手");
    }

    @Override
    public void buildLeftFeet() {
        System.out.println("瘦左脚");
    }

    @Override
    public void buildRightFeet() {
        System.out.println("瘦右脚");
    }
}
