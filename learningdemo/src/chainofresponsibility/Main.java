package chainofresponsibility;

/**
 * @author Pace2Car
 * @date 2019/1/7 10:44
 */
public class Main {
    public static void main(String[] args) {
        //设置管理者
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("员工请假");
        request.setNumber(1);
        commonManager.requestApplications(request);

        request.setNumber(3);
        commonManager.requestApplications(request);

        request.setNumber(6);
        commonManager.requestApplications(request);

        request.setNumber(8);
        commonManager.requestApplications(request);

        request.setRequestType("加薪");
        request.setRequestContent("员工申请加薪");
        request.setNumber(500);
        commonManager.requestApplications(request);

        request.setNumber(1500);
        commonManager.requestApplications(request);

        request.setNumber(2200);
        commonManager.requestApplications(request);
    }
}
