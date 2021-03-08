package handler;

/**
 * Created by shuo.sun on 2021/3/8.
 */
public class Handler {

    public Handler() {
        Looper looper = Looper.myLooper();
        if (looper == null) {
            throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
        }
    }
}
