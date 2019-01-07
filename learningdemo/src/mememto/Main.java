package mememto;

/**
 * @author Pace2Car
 * @date 2019/1/4 10:11
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        System.out.println(originator);

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("off");
        System.out.println(originator);

        originator.restore(caretaker.getMemento());

        System.out.println(originator);
    }
}
