/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public boolean wasRun;
    public boolean wasSetUp;

    public WasRun(String methodName){
        super(methodName);
    }

    public void testMethod(){
        wasRun = true;
    }

    @Override
    public void setUp(){
        wasSetUp = true;
        wasRun = false;
    }
}
