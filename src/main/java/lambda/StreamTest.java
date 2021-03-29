package lambda;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * StreamApi 提供了一套新的流式处理的抽象序列
 * StreamApi 支持函数式编程和链式操作
 * SteamApi 可以表示无限个元素，并且大多数情况下是惰性求值的
 * 创建Steam的方法有：
 * 通过指定元素，指定数组，指定集合创建Stream
 * 通过Supplier创建Steam，可以是无限序列
 * 通过其他类的相关方法创建
 *
 * Stream常用操作：
 * 转换操作：map,filter
 * 合并操作:concat,flatMap
 * 聚合操作：reduce,collect，count,min,max,sum,average
 * 并行处理：parallel
 * 其他操作：allMatch,anyMatch,forEach
 */

public class StreamTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alice", "Tim");
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
        Stream<String> stringStream = Stream.of("A","B","C");
        stringStream.forEach(System.out::println);

        Pattern p = Pattern.compile("\\s+");
        Stream<String> s = p.splitAsStream("The quick brown fox jumps over the lazy dog");
        s.forEach(System.out::println);

        LongStream.generate(new FibonacciSupplier()).limit(15).forEach(System.out::println);

        Arrays.stream(new String[]{"2020-04-01", "2020-04-02", "2020-04-03", "2020-04-04"}).map(LocalDate::parse).forEach(System.out::println);

        Stream.generate(new LocalDateSupplier())
                .limit(31)
                .filter(ldt -> ldt.getDayOfWeek() == DayOfWeek.SATURDAY || ldt.getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(System.out::println);
    }
}

class FibonacciSupplier implements LongSupplier {

    private int i = 0;

    private int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public long getAsLong() {
        return fibonacci(i++);
    }
}

class LocalDateSupplier implements Supplier<LocalDate> {
    LocalDate start = LocalDate.of(2020, 1, 1);
    int n = -1;
    public LocalDate get() {
        n++;
        return start.plusDays(n);
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person:" + this.name;
    }
}