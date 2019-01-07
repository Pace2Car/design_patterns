package command;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:19
 */
public abstract class Command {
    protected Barbecuer receiver;
    private String name;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void excuteCommand();
}
