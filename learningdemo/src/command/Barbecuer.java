package command;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:18
 */
public class Barbecuer {
    private int muttonNumber = 3;
    private int chickenWingNumber = 1;

    public void bakeMutton() {
        if (muttonNumber > 0) {
            System.out.println("烤羊肉串");
            muttonNumber--;
        } else {
            System.out.println("羊肉串没了，点个别的吧");
        }
    }

    public void bakeChickenWing() {
        if (chickenWingNumber > 0) {
            System.out.println("烤鸡翅");
            chickenWingNumber--;
        } else {
            System.out.println("鸡翅没了，点个别的吧");
        }
    }
}
