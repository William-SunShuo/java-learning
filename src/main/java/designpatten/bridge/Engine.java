package designpatten.bridge;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public abstract class Engine {

    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
