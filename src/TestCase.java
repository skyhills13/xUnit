import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public abstract class TestCase {
    public String methodName;

    public TestCase(String methodName) {
        this.methodName = methodName;
    }

    public void run() {
        setUp();
        Class c = this.getClass();
        try {
            Method method = c.getMethod(this.methodName);
            method.invoke(this);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e ) {
            e.printStackTrace();
        }
    }

    public void setUp(){

    }
}
