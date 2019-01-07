package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:48
 */
public class Secretary implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String event;

    @Override
    public String getEvent() {
        return event;
    }

    @Override
    public void setEvent(Object event) {
        this.event = (String) event;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println(getEvent());
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
