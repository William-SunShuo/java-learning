package designpatten.singleton;

public class Singleton3 {
    //静态内部类

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return Holder.singleton3;
    }

    private static class Holder {
        private static Singleton3 singleton3 = new Singleton3();
    }
}
