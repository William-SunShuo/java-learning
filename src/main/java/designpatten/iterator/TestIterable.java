package designpatten.iterator;
import java.util.Iterator;

/**
 * Created by shuo.sun on 2021/3/22.
 */
public class TestIterable {


    /**
     * 迭代器模式：为集合对象提供一种顺序访问每个元素的方法，而又不暴露集合对象的内部结构
     * @param args
     */
    public static void main(String[] args) {
        ReverseArrayCollection<Integer> arrayCollection = new ReverseArrayCollection<>(1,2,3,4);
        for(Iterator<Integer> i = arrayCollection.iterator();i.hasNext();){
            System.out.println("" + i.next());
        }
    }
}
