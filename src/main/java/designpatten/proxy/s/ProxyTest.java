package designpatten.proxy.s;

public class ProxyTest {

    public static void main(String[] args) {
        ITalk people = new PeopleTalk("AOP", 18);
        people.talk("No proxy test");

        TalkProxy proxy = new TalkProxy(people);
        proxy.talk("proxy test", "代理");
    }

}
