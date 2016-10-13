/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest {
    private WasRun test;
    private TestResult testResult;

    public void testTemplateMethod(){
        testResult = new TestResult();
        test = new WasRun() {
            @Override
            void execute(TestResult testResult) {
                this.log = log + "testMethod ";
            }
        };
        test.run(testResult);
        assert "setUp testMethod tearDown ".equals(test.getLog());
    }

    public void testResult(){
        testResult = new TestResult();
        test = new WasRun() {
            @Override
            void execute(TestResult testResult) throws Exception {
                this.log = log + "testMethod ";
            }
        };
        test.run(testResult);
        assert "1 run, 0 failed".equals(testResult.getSummary());
    }

    public void testFailedResult(){
        testResult = new TestResult();
        test = new WasRun() {
            @Override
            void execute(TestResult testResult) throws Exception {
                throw new Exception();
            }
        };
        test.run(testResult);
        assert "1 run, 1 failed".equals(testResult.getSummary());
    }

    public void testFailedResultFormatting(){
        testResult = new TestResult();
        testResult.testStarted();
        testResult.testFailed();
        assert "1 run, 1 failed".equals(testResult.getSummary());
    }

//    public void testSuite(){
//        TestSuite testSuite = new TestSuite();
//        testSuite.add(new WasRun("testMothod"));
//        testSuite.add(new WasRun("testBrokenMethod"));
//        testSuite.run(testResult);
//        assert "2 run, 1 failed".equals(testResult.getSummary());
//    }
}
