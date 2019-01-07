package observer;

/**
 * @author Pace2Car
 * @date 2019/1/2 18:49
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

    Object getEvent();
    void setEvent(Object event);
}
