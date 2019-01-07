package abstractfactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Pace2Car
 * @date 2019/1/3 15:11
 */
public class DataAccess {
    private static Properties properties;
    private static String db = getProperty();

    private static void setProperty() {
        if (properties == null) {
            properties = new Properties();
            ClassLoader loader = DataAccess.class.getClassLoader();
            try {
                InputStream inputStream = loader.getResourceAsStream("abstractfactory/db.properties");
                if (inputStream == null) {
                    throw new RuntimeException("配置文件不存在");
                }
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getProperty() {
        if (properties == null) {
            setProperty();
        }
        return properties.getProperty("db");
    }

    public static UserDao createUserDao() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        if (db != null && !"".equals(db)) {
            String className = "abstractfactory." + db + "UserDao";
            return (UserDao) Class.forName(className).newInstance();
        }
        return null;
    }
}
