package generic;

/**
 * Created by shuo.sun on 2021/2/9.
 */
public class GenericMethods {
    // 类型推断只对赋值操作有效，其他时候并不起作用
    public <T, K> void f(T t, K k, String v) {
        System.out.println(t.getClass().getName() + "K:" + k + "v:" + v);
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f('c', 1, "A");
        genericMethods.f(genericMethods, 2, "B");
    }
}
