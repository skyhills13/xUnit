import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        TestCaseTest testCaseTest1 = new TestCaseTest("testRunning");
        testCaseTest1.run();

        TestCaseTest testCaseTest2 = new TestCaseTest("testSetUp");
        testCaseTest2.run();
    }
}
