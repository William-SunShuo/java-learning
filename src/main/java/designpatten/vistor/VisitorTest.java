package designpatten.vistor;
import java.io.File;

public class VisitorTest {

    public static void main(String[] args) {
        FileStructure fs = new FileStructure(new File("src/main/java"));
        fs.handle(new JavaFileVisitor());
    }

}
