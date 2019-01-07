package strategy;

import java.util.Scanner;

/**
 * @author Pace2Car
 * @date 2018/12/27 18:02
 */
public class CashContext {
    private Cash cash;

    public CashContext(String type) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        switch (type) {
            case "normal":
                cash = new CashNormal();
                break;
            case "rebate":
                System.out.print("打几折：");
                double r = sc.nextInt() * 0.1;
                cash = new CashRebate(r);
                break;
            case "return":
                System.out.print("满多少：");
                double c = sc.nextDouble();
                System.out.print("减多少：");
                double re = sc.nextDouble();
                cash = new CashReturn(c, re);
                break;
            default:
                throw new RuntimeException("请输入正确的付款方式");
        }
    }

    public double getMoney(double money) {
        return cash.acceptCash(money);
    }
}
