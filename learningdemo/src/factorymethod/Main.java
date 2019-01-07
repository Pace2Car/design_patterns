package factorymethod;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:27
 */
public class Main {
    public static void main(String[] args) {
        try {
            Operation operation = null;
            Factory factory = new SubFactory();
            operation = factory.createOperatipn();
            operation.setNumberA(1);
            operation.setNumberB(2);

            System.out.println("结果："+ operation.getResult());
        } catch (Exception e) {
            System.out.println("输入有误");
            e.printStackTrace();
        }
    }
}
