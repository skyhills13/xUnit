import java.lang.reflect.Method;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public abstract class TestCase {
    private String methodName;

    public TestCase(String methodName) {
        this.methodName = methodName;
    }

    public void run(TestResult testResult) {
        testResult.testStarted();
        setUp();
        Class c = this.getClass();
        try {
            Method method = c.getMethod(this.methodName);
            method.invoke(this);
        } catch (Exception e ) {
            testResult.testFailed();
        }
        tearDown();
    }

    public void tearDown() {

    }

    public void setUp(){

    }
}
