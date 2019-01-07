package adapter;

/**
 * @author Pace2Car
 * @date 2019/1/3 18:06
 */
public class Main {
    public static void main(String[] args) {
        AmericanPlayer forward = new Forward();
        forward.attack();

        AmericanPlayer center = new Center();
        center.defense();

        AmericanPlayer guard = new Guard();
        guard.attack();

        AmericanPlayer chineseCenter = new Translator();

        chineseCenter.attack();
        chineseCenter.defense();
    }
}
