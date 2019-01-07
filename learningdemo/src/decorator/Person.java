package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:20
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("我是：" + name);
    }
}
