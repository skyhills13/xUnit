/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestResult {
    private int runCount;

    public TestResult(){
        runCount = 0;
    }

    public String getSummary(){
        return runCount + " run, 0 failed";
    }

    public void testStarted(){
        runCount += 1;
    }
}
