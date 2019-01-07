package builder;

/**
 * @author Pace2Car
 * @date 2019/1/2 17:43
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("先造一个瘦子：");
        PersonBuilder thinBuilder = new ThinPerson();
        PersonDirector thinDirector = new PersonDirector(thinBuilder);
        thinDirector.buildAPerson();

        System.out.println("\n再造一个胖子：");
        PersonBuilder fatBuilder = new FatPerson();
        PersonDirector fatDirector = new PersonDirector(fatBuilder);
        fatDirector.buildAPerson();
    }
}
