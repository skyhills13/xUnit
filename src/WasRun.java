/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public String log;

    public WasRun(String methodName){
        super(methodName);
    }

    public void testMethod(){
        log = log + "testMethod ";
    }

    @Override
    public void setUp(){
        log = "setUp ";
    }

    @Override
    public void tearDown() {
        log = log + "tearDown ";
    }
}
