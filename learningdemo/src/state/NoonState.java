package state;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:02
 */
public class NoonState extends State {
    @Override
    void writeProgram(Work work) {
        int noonHour = 13;
        if (work.getHour() < noonHour) {
            System.out.println(work.getHour() + "点，中午饿了要吃东西");
        } else {
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
