package lambda;

public class OperatorTest {

    private MathOperator add = (a, b) -> a + b;

    private MathOperator minus = (a, b) -> a - b;

    private MathOperator multi = (a, b) -> a * b;

    private MathOperator divide = (a, b) -> a / b;

    /**
     * 单方法接口称之为functionalInterface
     * 接收functionalInterface的时候，可以把实例化的匿名类改为lambda表达式，大大简化代码
     * lambda的参数和返回值类型均有编译器自动推断
     */

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

    @FunctionalInterface
    interface GreetingService {
        void greet(String name);
    }

}
