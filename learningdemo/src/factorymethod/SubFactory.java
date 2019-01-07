package factorymethod;

/**
 * @author Pace2Car
 * @date 2018/12/29 15:55
 */
public class SubFactory implements Factory {
    @Override
    public Operation createOperatipn() {
        return new OperationSub();
    }
}
