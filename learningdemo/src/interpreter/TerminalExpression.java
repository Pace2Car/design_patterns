package interpreter;

/**
 * @author Pace2Car
 * @date 2019/1/7 15:49
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
