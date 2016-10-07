/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class WasRun extends TestCase{
    public boolean wasRun = false;

    public WasRun(String methodName){
        this.methodName = methodName;
    }

    //private으로 해두고 삽질 대박함. reflection으로 메서드 가져오려면 public이어야함
    //https://docs.oracle.com/javase/tutorial/reflect/member/methodInvocation.html
    public void testMethod(){
        wasRun = true;
    }
}
