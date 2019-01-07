package simplefactory;

import java.util.Scanner;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:27
 */
public class Main {
    public static void main(String[] args) {
        try {
            Operation operation = null;
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入第一个数：");
            double num1 = sc.nextDouble();
            System.out.print("请输入运算符：");
            String oper = sc.next();
            operation = OperationFactory.createOperate(oper);
            System.out.print("请输入第二个数：");
            double num2 = sc.nextDouble();
            operation.setNumberA(num1);
            operation.setNumberB(num2);

            System.out.println("结果："+ operation.getResult());
        } catch (Exception e) {
            System.out.println("输入有误");
            e.printStackTrace();
        }
    }
}
