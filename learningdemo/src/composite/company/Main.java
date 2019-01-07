package composite.company;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:45
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总部");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany xncomp = new ConcreteCompany("西南分公司");
        xncomp.add(new HRDepartment("西南分公司人力资源部"));
        xncomp.add(new FinanceDepartment("西南分公司财务部"));
        root.add(xncomp);

        ConcreteCompany cdcomp = new ConcreteCompany("成都分公司");
        cdcomp.add(new HRDepartment("成都分公司人力资源部"));
        cdcomp.add(new FinanceDepartment("成都分公司财务部"));
        xncomp.add(cdcomp);

        System.out.println("结构图");
        root.display(1);

        System.out.println("****************************");
        System.out.println("干活");
        root.doSomething();
    }
}
