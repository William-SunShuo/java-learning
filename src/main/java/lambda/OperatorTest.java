package lambda;

public class OperatorTest {

    private MathOperator add = (a, b) -> a + b;

    private MathOperator minus = (a, b) -> a - b;

    private MathOperator multi = (a, b) -> a * b;

    private MathOperator divide = (a, b) -> a / b;


    public static void main(String[] args) {
        OperatorTest operatorTest = new OperatorTest();
        System.out.println(operate(1, 2, operatorTest.add));
        System.out.println(operate(1, 2, operatorTest.minus));
        System.out.println(operate(1, 2, operatorTest.multi));
        System.out.println(operate(1, 2, operatorTest.divide));

        GreetingService greetingService = name -> System.out.println("hello" +" "+ name);
        greetingService.greet("William");

    }

    private static int operate(int a, int b, MathOperator mathOperator) {
        return mathOperator.operator(a, b);
    }

    interface GreetingService {
        void greet(String name);
    }

}
