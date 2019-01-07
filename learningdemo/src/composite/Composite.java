package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:11
 */
public class Composite extends Compnent {
    private List<Compnent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    void add(Compnent compnent) {
        children.add(compnent);
    }

    @Override
    void remove(Compnent compnent) {
        children.remove(compnent);
    }

    @Override
    void display(int depth) {
        System.out.println(new String(new char[depth]).replace("\0","-") + name);

        for (Compnent child : children) {
            child.display(depth + 2);
        }
    }
}
