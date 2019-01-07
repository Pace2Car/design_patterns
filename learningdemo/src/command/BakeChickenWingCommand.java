package command;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:22
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
        this.setName("烤鸡翅");
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }
}
