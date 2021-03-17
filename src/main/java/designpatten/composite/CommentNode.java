package designpatten.composite;

import java.util.List;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class CommentNode implements Node {

    private String comment;

    public CommentNode(String comment) {
        this.comment = comment;
    }

    @Override
    public Node addNode(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return null;
    }

    @Override
    public String toXml() {
        return "<!-- " + comment + " -->";
    }
}
