/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public boolean wasRun;

    public WasRun(String methodName){
        super(methodName);
        wasRun = false;
    }

    //https://docs.oracle.com/javase/tutorial/reflect/member/methodInvocation.html
    public void testMethod(){
        wasRun = true;
    }
}
