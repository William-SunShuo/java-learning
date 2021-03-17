package designpatten.composite;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class ElementNode implements Node {

    private String name;

    public ElementNode(String name) {
        this.name = name;
    }

    private List<Node> nodes = new ArrayList<>();

    @Override
    public Node addNode(Node node) {
        nodes.add(node);
        return this;
    }

    @Override
    public List<Node> children() {
        return nodes;
    }

    @Override
    public String toXml() {
        String start = "<" + name + ">\n";
        String end = "</" + name + ">\n";
        StringJoiner sj = new StringJoiner("", start, end);
        nodes.forEach(node -> {
            sj.add(node.toXml() + "\n");
        });
        return sj.toString();
    }
}
