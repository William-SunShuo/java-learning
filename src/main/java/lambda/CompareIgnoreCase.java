package lambda;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 所谓方法引用，就是某个方法签名和接口恰好一致，就可以传入方法引用
 * 方法参数一致（个数，类型），返回类型相同，就认为方法签名一致
 * functionalInterface可以传入：
 * 接口匿名实现类
 * lambda表达式
 * 符合方法签名的静态方法，实例方法，构造方法
 */

public class CompareIgnoreCase {

    public static void main(String[] args) {
        String[] strings = {"Banana", "apple", "orange", "lemon"};
        Comparator<String> comparator = String::compareToIgnoreCase;
        Arrays.sort(strings, comparator);
        System.out.println(String.join(",",strings));
    }
}
