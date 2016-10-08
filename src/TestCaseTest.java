/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {

    public TestCaseTest(String methodName){
        super(methodName);
    }

    public void testRunning(){
        WasRun test = new WasRun("testMethod");
        assert false : test.wasRun;
        test.run();
        assert true : test.wasRun;
    }

    public void testSetUp(){
        WasRun test = new WasRun("testMethod");
        test.run();
        assert test.wasSetUp;
    }
}
