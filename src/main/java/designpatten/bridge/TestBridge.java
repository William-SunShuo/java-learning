package designpatten.bridge;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public class TestBridge {

    public static void main(String[] args) {
        Car car = new BMW(new Fuel("fuel"));
        car.drive();
        Car car1 = new BMW(new Electronic("electronic"));
        car1.drive();
    }
}
