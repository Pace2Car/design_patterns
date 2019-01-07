package abstractfactory;

/**
 * @author Pace2Car
 * @date 2019/1/3 15:08
 */
public class OracleUserDao implements UserDao {
    @Override
    public void getUser() {
        System.out.println("访问Oracle里的User");
    }
}
