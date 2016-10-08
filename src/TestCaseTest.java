/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {
    private WasRun test;

    public TestCaseTest(String methodName){
        super(methodName);
    }

    public void testRunning(){
        test.run();
        assert true : test.wasRun;
    }

    public void testSetUp(){
        test.run();
        assert test.wasSetUp;
    }

    @Override
    public void setUp(){
        test = new WasRun("testMethod");
    }
}
