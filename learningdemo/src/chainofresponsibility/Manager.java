package chainofresponsibility;

/**
 * @author Pace2Car
 * @date 2019/1/7 10:29
 */
public abstract class Manager {
    protected String name;
    /**
     * 上级
     */
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    protected void printRequest(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.print(request.getRequestContent() + request.getNumber() + "天, ");
        } else if ("加薪".equals(request.getRequestType())) {
            System.out.print(request.getRequestContent() + request.getNumber() + "元, ");
        }
    }

    public abstract void requestApplications(Request request);
}
