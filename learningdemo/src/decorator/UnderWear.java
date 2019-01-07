package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:30
 */
public class UnderWear extends Finery {
    @Override
    public void show() {
        System.out.print("穿内裤 -->");
        super.show();
    }
}
