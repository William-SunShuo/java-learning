package generic;

/**
 * Created by shuo.sun on 2021/2/9.
 */
public class GenericMethods {
    // �����ƶ�ֻ�Ը�ֵ������Ч������ʱ�򲢲�������
    public <T, K> void f(T t, K k, String v) {
        System.out.println(t.getClass().getName() + "K:" + k + "v:" + v);
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f('c', 1, "A");
        genericMethods.f(genericMethods, 2, "B");
    }
}
