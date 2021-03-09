package handler;

/**
 * Created by shuo.sun on 2021/3/9.
 */
public class TextView {

    private Thread mThread;

    public TextView() {
        mThread = Thread.currentThread();
    }

    void checkThread() {
        if (mThread != Thread.currentThread()) {
            throw new RuntimeException(
                    "Only the original thread that created a view hierarchy can touch its views.");
        }
    }

    public void setText(String str) {
        checkThread();
        System.out.print(str);
    }
}
