package composite;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:09
 */
public class Leaf extends Compnent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    void add(Compnent compnent) {
        System.out.println("can not add");
    }

    @Override
    void remove(Compnent compnent) {
        System.out.println("can not remove");
    }

    @Override
    void display(int depth) {
        System.out.println(new String(new char[depth]).replace("\0","-") + name);
    }
}
