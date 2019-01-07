package builder;

/**
 * @author Pace2Car
 * @date 2019/1/2 17:41
 */
public class FatPerson extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("胖脑袋");
    }

    @Override
    public void buildBody() {
        System.out.println("胖身体");
    }

    @Override
    public void buildLeftHand() {
        System.out.println("胖左手");
    }

    @Override
    public void buildRightHand() {
        System.out.println("胖右手");
    }

    @Override
    public void buildLeftFeet() {
        System.out.println("胖左脚");
    }

    @Override
    public void buildRightFeet() {
        System.out.println("胖右脚");
    }
}
