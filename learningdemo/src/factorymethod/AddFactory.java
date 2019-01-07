package factorymethod;

/**
 * @author Pace2Car
 * @date 2018/12/29 15:54
 */
public class AddFactory implements Factory {
    @Override
    public Operation createOperatipn() {
        return new OperationAdd();
    }
}
