package strategy;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:51
 */
public class CashReturn extends Cash {
    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return money;
    }
}
