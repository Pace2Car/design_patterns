package observer.eventdelegate;

/**
 * @author Pace2Car
 * @date 2019/1/2 18:49
 */
public abstract class Subject {
    private EventHandler eventHandler = new EventHandler();
    private String event;

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public abstract void addObserver(Object object, String methodName, Object... args);

    public abstract void notifyObservers();
}
