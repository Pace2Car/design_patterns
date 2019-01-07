package composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:38
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    void add(Company company) {
        children.add(company);
    }

    @Override
    void remove(Company company) {
        children.remove(company);
    }

    @Override
    void display(int depth) {
        System.out.println(new String(new char[depth]).replace("\0","-") + name);

        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    void doSomething() {
        for (Company child : children) {
            child.doSomething();
        }
    }
}
