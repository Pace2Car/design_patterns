package abstractfactory;

import java.io.IOException;

/**
 * @author Pace2Car
 * @date 2019/1/3 15:18
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IOException {
        UserDao userDao = DataAccess.createUserDao();
        userDao.getUser();
    }
}
