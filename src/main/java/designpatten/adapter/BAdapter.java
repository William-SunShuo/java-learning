package designpatten.adapter;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class BAdapter implements A {

    private B b;

    public BAdapter(B b) {
        this.b = b;
    }

    @Override
    public void a() {
        b.b();
    }
}
