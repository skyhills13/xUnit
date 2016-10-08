/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestCaseTest extends TestCase {

    public TestCaseTest(String methodName){
        super(methodName);
    }

    public void testRunning(){
        WasRun test = new WasRun("testMethod");
        //test.run()에서 무조건 setUp을 호출해서 wasRun을 false로 넣었기 때문에 필요 없어짐
        //assert false : test.wasRun;
        test.run();
        assert true : test.wasRun;
    }

    public void testSetUp(){
        WasRun test = new WasRun("testMethod");
        test.run();
        assert test.wasSetUp;
    }
}
