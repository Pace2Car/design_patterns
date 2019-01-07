package adapter;
/**
 * @author Pace2Car
 * @date 2019/1/3 18:04
 */
public class Translator extends AmericanPlayer {
    private ChineseCenter chineseCenter = new ChineseCenter();
    @Override
    void attack() {
        chineseCenter.jingong();
    }

    @Override
    void defense() {
        chineseCenter.fangshou();
    }
}
