package chainofresponsibility;

/**
 * @author Pace2Car
 * @date 2019/1/7 10:33
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        printRequest(request);
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(name + ": 批准请假" + request.getNumber() + "天");
        } else {
            System.out.println(name + "：需要请求上级");
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
