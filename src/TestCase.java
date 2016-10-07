import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCase {
    public String methodName;

    public void run() {
        Class c = this.getClass();
        try {
            Method method = c.getMethod(this.methodName);
            method.invoke(this);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e ) {
            e.printStackTrace();
        }
    }
}
