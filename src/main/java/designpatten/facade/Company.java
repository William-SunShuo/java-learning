package designpatten.facade;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class Company {
    private int id;
    private String name;

    public Company(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
