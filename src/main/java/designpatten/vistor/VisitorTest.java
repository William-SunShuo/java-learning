package designpatten.vistor;
import java.io.File;

public class VisitorTest {

    /**
     * 访问者模式的核心思想是为了访问复杂的数据结构，而不去改变数据结构，而是把对数据的操作抽象出来
     * 在访问的过程中以回调形式在访问者中处理操作逻辑。如果要新增一组操作，只需要增加一个新的访问者
     */

    public static void main(String[] args) {
        FileStructure fs = new FileStructure(new File("src/main/java"));
        fs.handle(new JavaFileVisitor());
    }

}
