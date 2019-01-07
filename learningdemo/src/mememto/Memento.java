package mememto;

/**
 * @author Pace2Car
 * @date 2019/1/4 10:09
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
