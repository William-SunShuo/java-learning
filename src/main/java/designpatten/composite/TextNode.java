package designpatten.composite;

import java.util.List;

/**
 * Created by shuo.sun on 2021/3/17.
 */
public class TextNode implements Node {

    private String text;

    public TextNode(String text) {
        this.text = text;
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
        return text;
    }
}
