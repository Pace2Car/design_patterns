package chainofresponsibility;

/**
 * @author Pace2Car
 * @date 2019/1/7 10:41
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        printRequest(request);
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 7) {
            System.out.println(name + ": 批准请假" + request.getNumber() + "天");
        } else if ("请假".equals(request.getRequestType()) && request.getNumber() > 7) {
            System.out.println(name + ": 再考虑考虑");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 2000) {
            System.out.println(name + ": 批准加薪" + request.getNumber() + "元");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 2000) {
            System.out.println(name + ": 再考虑考虑");
        }
    }
}
