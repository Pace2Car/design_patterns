package template;

/**
 * @author Pace2Car
 * @date 2019/1/2 15:07
 */
public abstract class TestPaper {
    public void question1(String aws) {
        System.out.println("试题1：...");
        System.out.println("答案：" + anwser1(aws));
    }

    abstract String anwser1(String aws);

    public void question2(String aws) {
        System.out.println("试题2：...");
        System.out.println("答案：" + anwser2(aws));
    }

    abstract String anwser2(String aws);
}
