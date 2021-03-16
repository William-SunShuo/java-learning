package designpatten.bridge;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class BMW extends Car{

    public BMW(Engine engine) {
        super(engine);
    }

    @Override
    protected void drive() {
        System.out.println(this.engine.getName() + "  BMW  " + "start");
    }
}
