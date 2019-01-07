package composite;

/**
 * @author Pace2Car
 * @date 2019/1/4 11:14
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("Leaf XA"));
        composite.add(new Leaf("Leaf XB"));

        root.add(composite);

        Composite composite2 = new Composite("Composite XY");
        composite2.add(new Leaf("Leaf XYA"));
        composite2.add(new Leaf("Leaf XYB"));

        composite.add(composite2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
