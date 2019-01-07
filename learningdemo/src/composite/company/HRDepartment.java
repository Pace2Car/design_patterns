package composite.company;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:42
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    void add(Company company) {
        System.out.println("can not add");
    }

    @Override
    void remove(Company company) {
        System.out.println("can not remove");
    }

    @Override
    void display(int depth) {
        System.out.println(new String(new char[depth]).replace("\0","-") + name);
    }

    @Override
    void doSomething() {
        System.out.println(name + "员工招聘培训管理");
    }
}
