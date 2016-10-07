public class Main {

    public static void main(String[] args) {
        WasRun testCase = new WasRun();
        System.out.println(testCase.wasRun); //expect false
        testCase.testMethod();
        System.out.println(testCase.wasRun); //expect true
    }
}
