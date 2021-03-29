package designpatten.singleton;

public class Singleton2 {

    //懒汉式
    private static volatile Singleton2 instance;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
         if(instance == null){
             synchronized (Singleton2.class){
                 if(instance == null){  //DCL
                     instance = new Singleton2();
                 }
             }
         }
         return instance;
    }
}
