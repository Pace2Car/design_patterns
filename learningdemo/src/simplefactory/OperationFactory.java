package simplefactory;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:21
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:
                throw new RuntimeException("请输入正确的运算符");
        }
        return operation;
    }
}
