import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun{
    public boolean wasRun = false;
    public String methodName;

    public WasRun(String methodName){
        this.methodName = methodName;
    }

    public void run() {
        Class c = this.getClass();
        try {
        Method method = c.getMethod(this.methodName);
        method.invoke(this);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e ) {
            e.printStackTrace();
        }
    }

    //private으로 해두고 삽질 대박함. reflection으로 메서드 가져오려면 public이어야함
    //https://docs.oracle.com/javase/tutorial/reflect/member/methodInvocation.html
    public void testMethod(){
        wasRun = true;
    }
}
