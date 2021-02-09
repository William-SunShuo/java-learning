package generic;

/**
 * Created by shuo.sun on 2021/2/9.
 */
public class Tuple {

    public static <A,B> TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<>(a,b);
    }

    static TwoTuple<String,Integer> f(){
        return tuple("hi",47);
    }

    static TwoTuple f2(){
        return tuple("hi",47);
    }

    public static void main(String[] args){
        f();
        f2();
    }
}
