package interpreter;

/**
 * @author Pace2Car
 * @date 2019/1/7 15:50
 */
public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
