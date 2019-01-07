package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/7 11:55
 */
public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void removeColleague(Colleague colleague) {
        colleagues.remove(colleague);
    }

    public abstract void send(String message, Colleague colleague);
}
