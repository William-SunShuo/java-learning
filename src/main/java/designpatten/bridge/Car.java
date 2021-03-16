package designpatten.bridge;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public abstract class Car {

    protected Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    protected abstract void drive();
}
