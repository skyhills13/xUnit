/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {

    public TestCaseTest(String methodName){
        this.methodName = methodName;
    }

    public void testRunning(){
        WasRun wasRun = new WasRun("testMethod");
        assert false : wasRun.wasRun;
        wasRun.run();
        assert true : wasRun.wasRun;
    }
}
