/**
 * Created by soeunpark on 2016. 10. 8..
 */
public abstract class WasRun extends TestCase{
    protected String log;

    @Override
    public void setUp(){
        log = "setUp ";
    }

    @Override
    public void tearDown() {
        log = log + "tearDown ";
    }

    public String getLog(){
        return log;
    }
}
