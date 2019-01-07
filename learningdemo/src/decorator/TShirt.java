package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:26
 */
public class TShirt extends Finery {
    @Override
    public void show() {
        System.out.print("穿TShirt -->");
        super.show();
    }
}
