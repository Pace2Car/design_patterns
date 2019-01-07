package propertype;

/**
 * @author Pace2Car
 * @date 2019/1/2 11:26
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume r = new Resume("aaa");
        r.setPersonalInfo("男", "20");

        Resume a = (Resume) r.clone();
        a.setPersonalInfo("女", "22");

        System.out.println(r);
        System.out.println(a);

        Resume b = (Resume) r.clone();
        b.setName("bbb");
        System.out.println(b);
    }
}
