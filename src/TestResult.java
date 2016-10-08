/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestResult {
    private int runCount;
    private int failedCount;

    public TestResult(){
        runCount = 0;
        failedCount = 0;
    }

    public String getSummary(){
        return runCount + " run, " + failedCount + " failed";
    }

    public void testStarted(){
        runCount += 1;
    }

    public void testFailed() {
        failedCount +=1;
    }
}
