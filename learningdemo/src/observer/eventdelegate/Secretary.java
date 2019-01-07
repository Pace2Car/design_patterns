package observer.eventdelegate;

/**
 * @author Pace2Car
 * @date 2019/1/3 9:48
 */
public class Secretary extends Subject {

    @Override
    public void addObserver(Object object, String methodName, Object... args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyObservers() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
