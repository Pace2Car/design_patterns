package propertype.deepcopy;

/**
 * @author Pace2Car
 * @date 2019/1/2 14:03
 */
public class Resume implements Cloneable {
    private String name;
    private String gender;
    private String age;
    private WorkExperience experience;

    public Resume(String name) {
        this.name = name;
        experience = new WorkExperience();
    }

    private Resume(WorkExperience experience) throws CloneNotSupportedException {
        this.experience = (WorkExperience) experience.clone();
    }

    public void setPersonalInfo(String gender, String age) {
        this.gender = gender;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        experience.setWorkDate(workDate);
        experience.setCpmpany(company);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", experience=" + experience +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.experience);
        obj.name = this.name;
        obj.gender = this.gender;
        obj.age = this.age;
        return obj;
    }
}
