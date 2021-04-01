package thread;

public class InterruptTest2 {
    public static void main(String[] args){
        Thread t = new MyThread2();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt(); // 中断t线程
        try {
            t.join(); // 等待t线程结束
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main interrupted!");
        }
        System.out.println("end");
    }
}

class MyThread2 extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start(); // 启动hello线程
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("hello interrupted:" + hello.isInterrupted());
            System.out.println("MyThread2 interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread {
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("HelloThread interrupted!");
                break;
            }
        }
    }
}
