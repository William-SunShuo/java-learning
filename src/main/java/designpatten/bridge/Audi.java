package designpatten.bridge;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class Audi extends Car {

    public Audi(Engine engine) {
        super(engine);
    }

    @Override
    protected void drive() {
        System.out.println(this.engine + " Audi " + "start");
    }
}
