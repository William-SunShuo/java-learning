package designpatten.flyweight;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class TestFlyWeight {

    /*
    *  如果一个对象实例一经创建就不可变，那么反复创建相同的实例就没有必要，直接向调用者
    *  返回一个共享的实例就行，这样既节省内存，又可以减少创建对象的过程，提高运行速度
    * */


    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf(100);
        System.out.println(n1 == n2); // true
    }
}
