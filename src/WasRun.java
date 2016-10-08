/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public boolean wasRun;
    public boolean wasSetUp;

    public WasRun(String methodName){
        super(methodName);
        wasRun = false;
    }

    public void testMethod(){
        wasRun = true;
    }
}
