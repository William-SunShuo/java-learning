package thread;

public class InterruptTest {

    /**
     * volatile关键字解决了共享变量在线程间访问的可见性问题
     *
     */
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();//中断t线程
        try {
            t.join();//等待t线程结束
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("InterruptedException");
        }
        System.out.println("end");
    }

}

class MyThread extends Thread {

    /**
     * 中断只是 isInterrupted变成了true,最后一句“world”还是能输出，即执行完所有代码
     */
    @Override
    public void run() {
        System.out.println("hello!");
        for (int i = 0; i < 1000; i++) {
            System.out.println("isInterrupted:" + isInterrupted());
            System.out.println("i:" + i);
        }
        System.out.println("world");
    }
}
