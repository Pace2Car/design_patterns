package propertype;

/**
 * @author Pace2Car
 * @date 2019/1/2 11:20
 */
public class Resume implements Cloneable {

    private String name;
    private String gender;
    private String age;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
