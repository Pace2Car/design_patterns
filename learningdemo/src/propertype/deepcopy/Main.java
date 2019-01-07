package propertype.deepcopy;

/**
 * @author Pace2Car
 * @date 2019/1/2 11:26
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume r = new Resume("aaa");
        r.setPersonalInfo("男", "20");
        r.setWorkExperience("1777-2000","apple");

        Resume a = (Resume) r.clone();
        a.setPersonalInfo("女", "22");
        a.setWorkExperience("1999-2019","google");

        Resume b = (Resume) r.clone();
        b.setPersonalInfo("男", "25");
        b.setWorkExperience("1991-2011","microsoft");

        System.out.println(r);
        System.out.println(a);
        System.out.println(b);
    }
}
