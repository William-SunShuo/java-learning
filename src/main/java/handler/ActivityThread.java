package handler;

/**
 * Created by shuo.sun on 2021/3/8.
 */
public class ActivityThread {

    public static void main(String[] args) {
        Looper.prepareMainLooper();
        ActivityThread thread = new ActivityThread();
        thread.attach();
        Looper.loop();
    }

    private void attach() {
        Activity a = new Activity();
        a.onCreate();
    }


}
