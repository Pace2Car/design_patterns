package strategy;

import java.util.Scanner;

/**
 * @author Pace2Car
 * @date 2018/12/27 18:14
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入商品总额：");
            double count = sc.nextDouble();
            System.out.print("请输入收款方式：");
            String type = sc.next();

            System.out.println("实际收款：" + new CashContext(type).getMoney(count));
        } catch (Exception e) {
            System.out.println("输入有误");
            e.printStackTrace();
        }
    }
}
