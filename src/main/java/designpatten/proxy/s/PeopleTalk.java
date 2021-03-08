package designpatten.proxy.s;

public class PeopleTalk implements ITalk {

    private String userName;
    private int age;

    public PeopleTalk(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public void talk(String msg) {
         System.out.println(msg + "你好，我是" + userName + ",我的年龄是："+ age);
    }
}
