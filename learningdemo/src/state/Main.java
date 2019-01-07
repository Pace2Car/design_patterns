package state;

/**
 * @author Pace2Car
 * @date 2019/1/3 17:08
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(14);
        work.writeProgram();

        work.setHour(18);
        work.writeProgram();
    }
}
