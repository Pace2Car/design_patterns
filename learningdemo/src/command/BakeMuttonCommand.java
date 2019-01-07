package command;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:21
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
        this.setName("羊肉串");
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
