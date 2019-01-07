package factorymethod;

/**
 * @author Pace2Car
 * @date 2018/12/27 17:18
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
