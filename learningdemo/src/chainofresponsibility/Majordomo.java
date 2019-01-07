package chainofresponsibility;

/**
 * @author Pace2Car
 * @date 2019/1/7 10:40
 */
public class Majordomo extends Manager{
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        printRequest(request);
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(name + ": 批准请假" + request.getNumber() + "天");
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 1000) {
            System.out.println(name + ": 批准加薪" + request.getNumber() + "元");
        } else {
            System.out.println(name + "：需要请求上级");
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
