package designpatten.decorator;

/**
 * Created by shuo.sun on 2021/3/16.
 */
public abstract class NodeDecorator implements TextNode {

    protected TextNode textNode;

    public NodeDecorator(TextNode textNode) {
        this.textNode = textNode;
    }

    @Override
    public void setText(String text) {
        textNode.setText(text);
    }

}
