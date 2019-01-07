package strategy;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:50
 */
public class CashRebate extends Cash {
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
