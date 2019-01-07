package state;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:00
 */
public class ForenoonState extends State {
    @Override
    void writeProgram(Work work) {
        int morningHour = 12;
        if (work.getHour() < morningHour) {
            System.out.println(work.getHour() + "点，早上精神百倍");
        } else {
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
