/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {
    private WasRun test;
    private TestResult testResult;

    public TestCaseTest(String methodName){
        super(methodName);
    }

    @Override
    public void setUp(){
        testResult = new TestResult();
    }

    public void testTemplateMethod(){
        test = new WasRun("testMethod");
        test.run(testResult);
        assert "setUp testMethod tearDown ".equals(test.log);
    }

    public void testResult(){
        test = new WasRun("testMethod");
        test.run(testResult);
        assert "1 run, 0 failed".equals(testResult.getSummary());
    }

    public void testFailedResult(){
        test = new WasRun("testBrokenMethod");
        test.run(testResult);
        assert "1 run, 1 failed".equals(testResult.getSummary());
    }

    //brokenMethod 테스트를 위한 임시 테스트. 지금은 불필요해짐
    public void testFailedResultFormatting(){
        testResult.testStarted();
        testResult.testFailed();
        assert "1 run, 1 failed".equals(testResult.getSummary());
    }

    public void testSuite(){
        TestSuite testSuite = new TestSuite();
        testSuite.add(new WasRun("testMothod"));
        testSuite.add(new WasRun("testBrokenMethod"));
        testSuite.run(testResult);
        assert "2 run, 1 failed".equals(testResult.getSummary());
    }
}
