package designpatten.facade;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class TestFacade {

    /*
    * 为子系统的一组接口提供一个一致的界面，屏蔽内部子系统的调用细节
    * */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.openCompany("facade software com");
    }
}
