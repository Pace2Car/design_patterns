package observer.eventdelegate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/3 11:04
 */
public class EventHandler {
    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        events.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception {
        for (Event event : events) {
            event.invoke();
        }
    }
}
