package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:30
 */
public class Pant extends Finery {
    @Override
    public void show() {
        System.out.print("穿外裤 -->");
        super.show();
    }
}
