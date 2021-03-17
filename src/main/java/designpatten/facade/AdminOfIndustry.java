package designpatten.facade;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class AdminOfIndustry {
    Company register(String name){
        return new Company(1111,name);
    }
}
