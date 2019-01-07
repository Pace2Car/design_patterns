package state;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:07
 */
public class AfternoonState extends State {
    @Override
    void writeProgram(Work work) {
        int AfternoonHour = 17;
        if (work.getHour() < AfternoonHour) {
            System.out.println(work.getHour() + "点，下午精神不错继续努力");
        } else {
            System.out.println(work.getHour() + "点，下班啦！");
        }
    }
}
