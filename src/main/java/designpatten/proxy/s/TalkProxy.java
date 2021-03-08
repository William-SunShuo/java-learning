package designpatten.proxy.s;

public class TalkProxy implements ITalk {

    private ITalk iTalk;

    public TalkProxy(ITalk iTalk) {
        this.iTalk = iTalk;
    }

    @Override
    public void talk(String msg) {
       iTalk.talk(msg);
    }

    public void talk(String msg,String singname){
        talk(msg);
        sing(singname);
    }

    private void sing(String singname){
       System.out.print(singname);
    }
}
