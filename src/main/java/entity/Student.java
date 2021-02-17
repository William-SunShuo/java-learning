package entity;

import enums.Gender;

/**
 * Created by DELL1 on 2021/2/9.
 */
public class Student extends Person implements Comparable<Student>{

    private String no;
    private String name;
    private int age;
    private Gender gender;

    public Student(String no,String name,int age,Gender gender){
        this.no = no;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
