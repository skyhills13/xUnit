import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /**
         * 실행 로직
         * 1. TestCaseTest 인스턴스 생성
         *      => 파라미터로 넣은 메서드 이름은 super class인 TestCase에서 지정한 methodName 변수로 저장
         * 2. run()을 실행하면 먼저 setUp()을 실행
         *      => setUp()은 override했으므로 TestCaseTest의 setUp()이 호출
         *      => 즉, WasRun인스턴스를 만들어 TestCaseTest의 변수로 저장
         * 3. 리플렉션을 이용해 methodName에 해당하는 메서드 실행
         *      => TestCaseTest의 testRunning()을 실행
         *          a. WasRun 인스턴스의 run()이 실행
         *              => 그 안에서 WasRun 인스턴스의 setUp()이 먼저 실행
         *              => wasSetUp = true; wasRun = false;
         *              => WasRun 인스턴스는 "testMethod"을 인자로 넣었으므로 testMethod의 내용인 wasRun = true이 됨
         *          b. wasRun 값이 true인지 확인
         */
        /**
         * 부연 설명
         * WasRun의 testMethod는 JUnit에서 각 테스트 메서드 역할을 하고 있는 셈. (내가 건드리지 않는 프레임워크 단의)
         */
        TestCaseTest testCaseTest2 = new TestCaseTest("testTemplateMethod");
        testCaseTest2.run();

        TestCaseTest testCaseTest3 = new TestCaseTest("testResult");
        testCaseTest3.run();


    }
}
