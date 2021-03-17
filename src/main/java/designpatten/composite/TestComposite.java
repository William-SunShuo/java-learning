package designpatten.composite;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class TestComposite {

    /*
    * 将对象组合成树形结构，以表示整体-部分的层次结构，使得用户对单个对象和组合对象的使用具有一致性
    */

    public static void main(String[] args) {
        Node root = new ElementNode("school");
        root.addNode(new ElementNode("classA")
                .addNode(new TextNode("Tom"))
                .addNode(new TextNode("Alice")));
        root.addNode(new ElementNode("classB")
                .addNode(new TextNode("Bob"))
                .addNode(new TextNode("Grace"))
                .addNode(new CommentNode("comment...")));
        System.out.println(root.toXml());
    }
}
