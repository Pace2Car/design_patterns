package factorymethod;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:20
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
