package builder;

/**
 * @author Pace2Car
 * @date 2019/1/2 17:42
 */
public class PersonDirector {
    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void buildAPerson() {
        builder.buildHead();
        builder.buildBody();
        builder.buildLeftHand();
        builder.buildRightHand();
        builder.buildLeftFeet();
        builder.buildRightFeet();
    }
}
