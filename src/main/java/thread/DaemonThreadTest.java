package thread;

public class DaemonThreadTest {


    /**
     * 守护线程不能持有任何需要关闭的资源。
     * 守护线程是为其他线程服务的线程；
     * 所有非守护线程都执行完毕后，虚拟机退出
     *
     */
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.setDaemon(true);
        t.start();
    }
}
