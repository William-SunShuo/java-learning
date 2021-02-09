package generic;
import entity.Person;
import entity.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shuo.sun on 2021/2/9.
 */
public class LimitsOfInference {

    static void f(Map<Person,List<? extends Pet>> petPeople){
        System.out.print(petPeople.size());
    }

    public static void main(String[] args){
        Map<Person,List<? extends Pet>> map = New.<Person,List<? extends Pet>>map();
        List<Pet> list = new ArrayList<>();
        list.add(new Pet());
        map.put(new Person(),list);
        f(map);
    }
}

class New{
    public static <K,V> Map<K,V> map(){
        return new HashMap<>();
    }
}
