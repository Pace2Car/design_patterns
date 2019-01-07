package command;

/**
 * @author Pace2Car
 * @date 2019/1/4 18:34
 */
public class Main {
    public static void main(String[] args) {
        //开店准备
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);
        Waiter waiter = new Waiter();

        //客人进店、点单
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeChickenWingCommand);
        waiter.setOrder(bakeChickenWingCommand);

        //点单完毕
        waiter.notifyReceiver();

    }
}
