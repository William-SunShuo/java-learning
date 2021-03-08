package designpatten.proxy.d;

import designpatten.proxy.s.ITalk;
import designpatten.proxy.s.PeopleTalk;

public class Test {

    public static void main(String[] args) {
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("Aop",18));
        iTalk.talk("业务");
    }
}
