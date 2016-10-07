import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        WasRun testCase = new WasRun("testMethod");
        System.out.println(testCase.wasRun); //expect false
        testCase.run();
//        testCase.testMethod();
        System.out.println(testCase.wasRun); //expect true
    }
}
