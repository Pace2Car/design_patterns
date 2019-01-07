package propertype.deepcopy;

/**
 * @author Pace2Car
 * @date 2019/1/2 13:59
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    private String cpmpany;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCpmpany() {
        return cpmpany;
    }

    public void setCpmpany(String cpmpany) {
        this.cpmpany = cpmpany;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", cpmpany='" + cpmpany + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
