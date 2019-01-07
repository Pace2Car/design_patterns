package decorator;

/**
 * @author Pace2Car
 * @date 2018/12/29 10:31
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("普通人");
        System.out.println("普通人：");

        TShirt t = new TShirt();
        UnderWear u = new UnderWear();
        Pant pant = new Pant();

        t.decorate(p);
        pant.decorate(t);
        u.decorate(pant);
        u.show();

        System.out.println("-----------");
        Person sm = new Person("超人");
        System.out.println("超人：");

        u.decorate(sm);
        pant.decorate(u);
        t.decorate(pant);
        t.show();

    }
}
