package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:24
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();


    public void setOrder(Command command) {
            orders.add(command);
    }

    public void notifyReceiver() {
        for (Command order : orders) {
            order.excuteCommand();
        }
    }
}
