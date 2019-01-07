package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pace2Car
 * @date 2019/1/7 17:22
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
