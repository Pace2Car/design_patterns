package strategy;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:52
 */
public class CashNormal extends Cash {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
