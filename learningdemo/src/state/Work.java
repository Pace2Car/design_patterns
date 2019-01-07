package state;

/**
 * @author Pace2Car
 * @date 2019/1/3 16:57
 */
public class Work {
    private State current;
    private double hour;
    public Work() {
        current = new ForenoonState();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }
}
