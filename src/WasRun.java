/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public boolean wasRun;
    public String log;

    public WasRun(String methodName){
        super(methodName);
    }

    public void testMethod(){
        wasRun = true;
        log = log + "testMethod ";
    }

    @Override
    public void setUp(){
        wasRun = false;
        log = "setUp ";
    }
}
