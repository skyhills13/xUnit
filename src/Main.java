import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        TestCaseTest testCaseTest = new TestCaseTest();
        testCaseTest.testTemplateMethod();
        testCaseTest.testResult();
        testCaseTest.testFailedResult();
        testCaseTest.testFailedResultFormatting();

//        TestSuite testSuite = new TestSuite();
//        testSuite.add(new TestCaseTest("testTemplateMethod"));
//        testSuite.add(new TestCaseTest("testResult"));
//        testSuite.add(new TestCaseTest("testFailedResultFormatting"));
//        testSuite.add(new TestCaseTest("testFailedResult"));
//        testSuite.add(new TestCaseTest("testSuite"));
//        TestResult testResult = new TestResult();
//        testSuite.run(testResult);
//        System.out.println(testResult.getSummary());
    }
}
