package generic;
import entity.Student;
import enums.Gender;
import java.util.*;

public class GenericTest1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "张三", 29, Gender.FEMALE));
        students.add(new Student("2", "李四", 30, Gender.MALE));
        students.add(new Student("3", "王五", 21, Gender.MALE));
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(students);

        for (int i = 0; i <students.size() ; i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
