import java.util.ArrayList;
import java.util.List;

/**
 * Created by soeunpark on 2016. 10. 8..
 */
public class TestSuite{
    private List<TestCase> testList;

    public TestSuite(){
        testList = new ArrayList<>();
    }

    public void add(TestCase singleTest){
       testList.add(singleTest);
    }

    public void run(TestResult result) {
        for(TestCase test : testList) {
            test.run(result);
        }
    }
}
