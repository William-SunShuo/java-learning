package generic;

import entity.Person;
import entity.Student;
import enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class GenericTest1 {

    public static void main(String[] args){
        List<String>  stringList = new ArrayList<>();
        stringList.add("s1");

        List<Person> persons = new ArrayList<>();
        persons.add(new Student("1","张三",19, Gender.FEMALE));
        persons.add(new Student("2","李四",20,Gender.MALE));
        persons.add(new Student("3","王五",21,Gender.MALE));
       for (Person p:persons){
           System.out.println(((Student)p).getName());
       }

    }
}
