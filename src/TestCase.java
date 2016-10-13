import java.lang.reflect.Method;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public abstract class TestCase {

    public TestCase() {
    }

    public void run(TestResult testResult) {
        testResult.testStarted();
        setUp();
        try {
            execute(testResult);
        } catch (Exception e ) {
            testResult.testFailed();
        }
        tearDown();
    }

    abstract void execute(TestResult testResult) throws Exception;

    public void tearDown() {

    }

    public void setUp(){

    }
}
