/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {
    private WasRun test;

    public TestCaseTest(String methodName){
        super(methodName);
    }

    public void testTemplateMethod(){
        test = new WasRun("testMethod");
        test.run();
        assert "setUp testMethod tearDown ".equals(test.log);
    }

    public void testResult(){
        test = new WasRun("testMethod");
        TestResult testResult = test.run();
        assert testResult.getSummary().equals("1 run, 0 failed");
    }
}
