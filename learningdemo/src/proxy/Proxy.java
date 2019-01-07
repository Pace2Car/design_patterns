package proxy;

/**
 * @author Pace2Car
 * @date 2018/12/29 11:31
 */
public class Proxy implements GiveGift {

    Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveGift() {
        pursuit.giveGift();
    }
}
