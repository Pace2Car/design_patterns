package facade;

/**
 * 基金类
 * @author Pace2Car
 * @date 2019/1/2 16:35
 */
public class Fund {
    private Stock stock;
    private NationalDebt nationalDebt;

    public Fund() {
        stock = new Stock();
        nationalDebt = new NationalDebt();
    }

    public void buyFund() {
        stock.buy();
        nationalDebt.buy();
    }

    public void sellFund() {
        stock.sell();
        nationalDebt.sell();
    }
}
