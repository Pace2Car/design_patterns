package proxy;

/**
 * @author Pace2Car
 * @date 2018/12/29 11:30
 */
public class Pursuit implements GiveGift {
    Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveGift() {
        System.out.println("追求者送" + girl.getName() + "礼物");
    }
}
