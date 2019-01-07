package abstractfactory;

/**
 * @author Pace2Car
 * @date 2019/1/3 15:09
 */
public class MySQLUserDao implements UserDao {
    @Override
    public void getUser() {
        System.out.println("访问MySQL里的User");
    }
}
