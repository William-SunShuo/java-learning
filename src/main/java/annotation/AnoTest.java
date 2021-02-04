package annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnoTest {

    @Ano("william")
    public String hello(String name) {
        return "hello " + name;
    }

    public static void main(String[] args) {
        try {
            Method method = AnoTest.class.getMethod("hello", String.class);
            Annotation[] annotations = method.getAnnotations();
            AnoTest hello = AnoTest.class.newInstance();
            Ano annotation = (Ano) annotations[0];
            String name = (String) method.invoke(hello, annotation.value());
            System.out.print("output:" + name);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
