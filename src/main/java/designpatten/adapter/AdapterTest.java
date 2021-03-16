package designpatten.adapter;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class AdapterTest {

    //编写一个适配器的步骤
    /*
    *   1.实现目标接口
    *   2.持有待转换接口的引用
    *   3.在目标接口实现方法内，调用待转换接口方法
    * */




    public static void main(String[] args) {
        B b = () -> System.out.println("I am B");

        View view = new View();
        view.show(new BAdapter(b));
    }
}
