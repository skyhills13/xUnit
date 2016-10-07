import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        TestCaseTest testCaseTest = new TestCaseTest("testRunning");
        testCaseTest.run();
//        WasRun testCase = new WasRun("testMethod");
//        System.out.println(testCase.wasRun); //expect false
//        testCase.run();
//        System.out.println(testCase.wasRun); //expect true
    }
}
