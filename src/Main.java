import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        TestCaseTest testCaseTest = new TestCaseTest("testRunning");
        testCaseTest.run();
    }
}
