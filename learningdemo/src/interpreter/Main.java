package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/7 15:51
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }
}
